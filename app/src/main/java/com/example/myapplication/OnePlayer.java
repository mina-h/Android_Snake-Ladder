package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class OnePlayer extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myapplication2.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player);
    }

    public void sendMessage(View view){

        EditText editText = findViewById(R.id.name);
        String message = editText.getText().toString();

        // Log.d("MainActivity", "knappen tryckt");
        Intent intent = new Intent(this,Quiz.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}