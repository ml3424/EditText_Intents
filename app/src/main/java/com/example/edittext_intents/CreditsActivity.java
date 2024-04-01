package com.example.edittext_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CreditsActivity extends AppCompatActivity {

    TextView tVLastAnswer;
    Intent gi;

    double result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        tVLastAnswer = findViewById(R.id.last_answer);

        gi = getIntent();
        result = gi.getDoubleExtra("result", 1);
        tVLastAnswer.setText("" + result);

    }

}