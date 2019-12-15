package com.example.moviedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Author extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);
    }

    public void MainActivity(View view) {
        Intent intent = new Intent(Author.this, MainActivity.class);
        startActivity(intent);
    }

    public void indonesia(View view) {
        Intent intent = new Intent(Author.this, IndonesiaActivity.class);
        startActivity(intent);

    }

    public void australia(View view) {
        Intent intent = new Intent(Author.this, AustraliaActivity.class);
        startActivity(intent);

    }

    public void afrika(View view) {
        Intent intent = new Intent(Author.this, AfrikaActivity.class);
        startActivity(intent);
    }

    public void eropa(View view) {
        Intent intent = new Intent(Author.this, EropaActivity.class);
        startActivity(intent);

    }

    public void amerika(View view) {
        Intent intent = new Intent(Author.this, AmerikaActivity.class);
        startActivity(intent);

    }

}

