package com.example.jatin.foreignlanguagefinal.French;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jatin.foreignlanguagefinal.R;

public class FrenchQuiz extends AppCompatActivity {

    Button quizButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_quiz);

        quizButton = findViewById(R.id.frenchQuizButton);

        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FrenchQuiz.this,FrenchQuizPlay.class));
                finish();
            }
        });


    }
}
