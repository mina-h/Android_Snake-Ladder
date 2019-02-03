package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Intent intent = getIntent();
        String message = intent.getStringExtra(OnePlayer.EXTRA_MESSAGE);

        TextView displayMessageView = findViewById(R.id.typed_name);
        displayMessageView.setText(message);
    }
}