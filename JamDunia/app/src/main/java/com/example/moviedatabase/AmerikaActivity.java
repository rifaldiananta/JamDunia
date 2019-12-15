package com.example.moviedatabase;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AmerikaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("UTC-03:30", "Waktu Musim Panas NewFoundland",
                R.raw.phrase_where_are_you_going));
        words.add(new Word("UTC-04:00", "Waktu Standar Atlantik",
                R.raw.phrase_what_is_your_name));
        words.add(new Word("UTC-05:00", "Waktu Standar Timur \n Waktu Musim Panas Timur", R.raw.phrase_my_name_is));
        words.add(new Word("UTC-06:00", "Waktu Standar Tengah \n Waktu Musim Panas Tenga", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("UTC-07:00", "Waktu Standar Pegunungan",
                R.raw.phrase_where_are_you_going));
        words.add(new Word("UTC-08:00", "Waktu Standar Pasifik",
                R.raw.phrase_what_is_your_name));
        words.add(new Word("UTC-09:00", "Waktu Standar Alaska", R.raw.phrase_my_name_is));
        words.add(new Word("UTC-10:00", "Waktu Standar Hawaii", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("UTC+12:00", "Waktu Standar Pulau Wake",
                R.raw.phrase_what_is_your_name));
        words.add(new Word("UTC+10:00", "Waktu Standar Chamorro.", R.raw.phrase_my_name_is));
        words.add(new Word("UTC-11:00", "Waktu Standar Samoa", R.raw.phrase_how_are_you_feeling));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
