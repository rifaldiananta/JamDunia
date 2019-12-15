package com.example.moviedatabase;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class EropaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("UTC+00:00", "Waktu Eropa Barat ",
                R.raw.phrase_where_are_you_going));
        words.add(new Word("UTC+01:00", "Waktu Musim Panas Eropa Barat",
                R.raw.phrase_what_is_your_name));
        words.add(new Word("UTC+01:00", "Waktu Eropa Tengah", R.raw.phrase_my_name_is));
        words.add(new Word("UTC+02:00", "Waktu Musim Panas Eropa Tengah", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("UTC+02:00", "Waktu Kaliningrad",
                R.raw.phrase_where_are_you_going));
        words.add(new Word("UTC+02:00", "Waktu Eropa Timur",
                R.raw.phrase_what_is_your_name));
        words.add(new Word("UTC+03:00", "Waktu Musim Panas Eropa Timur", R.raw.phrase_my_name_is));
        words.add(new Word("UTC+03:00", "Waktu Minsk, Waktu Moskwa", R.raw.phrase_how_are_you_feeling));



        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
