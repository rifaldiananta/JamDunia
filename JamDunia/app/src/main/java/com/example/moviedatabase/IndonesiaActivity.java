package com.example.moviedatabase;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class IndonesiaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("UTC+07:00", "Waktu Indonesia Barat (WIB)",
                R.raw.phrase_where_are_you_going));
        words.add(new Word("UTC+08:00", "Waktu Indonesia Tengah (WITA)",
                R.raw.phrase_what_is_your_name));
        words.add(new Word("UTC+09:00", "Waktu Indonesia Timur (WIT) ", R.raw.phrase_my_name_is));



        WordAdapter adapter = new WordAdapter(this, words, R.color.merah);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
