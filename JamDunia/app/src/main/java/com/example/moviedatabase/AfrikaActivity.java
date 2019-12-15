package com.example.moviedatabase;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AfrikaActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("UTC-01:00", "Waktu Tanjung Verde (CVT)",
                R.raw.phrase_where_are_you_going));
        words.add(new Word("UTC+00:00", "Waktu Greenwich (GMT)",
                R.raw.phrase_what_is_your_name));
        words.add(new Word("UTC+01:00", "Waktu Afrika Barat (WAT)", R.raw.phrase_my_name_is));
        words.add(new Word("UTC+02:00", "Waktu Afrika Tengah (CET/SAST)", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("UTC+03:00", "Waktu Afrika Timur (EAT/AST)", R.raw.phrase_my_name_is));
        words.add(new Word("UTC+04:00", "Waktu Mauritius", R.raw.phrase_how_are_you_feeling));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
