package com.example.gonza.androidbasics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    ImageView card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card = (ImageView) findViewById(R.id.card_image_view);
    }

    public void reveal(View v) {
        card.setVisibility(View.VISIBLE);
        v.setVisibility(View.GONE);
    }
}