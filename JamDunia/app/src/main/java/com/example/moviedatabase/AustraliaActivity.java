package com.example.moviedatabase;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AustraliaActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("UTC+10:00", "Waktu Standar Timur Australia (AEST)",
                R.raw.phrase_where_are_you_going));
        words.add(new Word("UTC+09:30", "Waktu Standar Tengah Australia (ACST)",
                R.raw.phrase_what_is_your_name));
        words.add(new Word("UTC+08:00", "Waktu Standar Barat Australia (AWST)", R.raw.phrase_my_name_is));
        words.add(new Word("UTC+08:45", "Waktu Standar Barat Tengah Australia ACWST)", R.raw.phrase_how_are_you_feeling));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
