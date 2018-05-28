package com.example.jatin.foreignlanguagefinal.French;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.IntRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jatin.foreignlanguagefinal.R;

public class FrenchQuiz extends AppCompatActivity {

    Button quizButton;
    TextView frenchPreviousScore;
    TextView frenchQuizTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_quiz);

        frenchPreviousScore = findViewById(R.id.frenchPreviousScore);
        frenchQuizTitle = findViewById(R.id.frenchQuizTitle);
        quizButton = findViewById(R.id.frenchQuizButton);

        SharedPreferences sp = getSharedPreferences("MyPrefsScore", 0);
        int prevScore = sp.getInt("PREVIOUS_SCORE",0);
        String realScore = String.valueOf(prevScore);
        //int prevScore = sp.getInt("PREVIOUS_SCORE", 0);
        frenchPreviousScore.setText("Previous Score: " + realScore);

            if(prevScore>=0 &&prevScore<5)
            {
                frenchQuizTitle.setText("NOOB");
            }
            else if (prevScore>=5 &&prevScore<10)
            {
                frenchQuizTitle.setText("BEGINNER");
            }
            else if (prevScore>=10 &&prevScore<15)
            {
                frenchQuizTitle.setText("INTERMEDIATE");
            }
            else if (prevScore>=15 &&prevScore<20)
            {
                frenchQuizTitle.setText("EXPERT");
            }
            else
            {
                frenchQuizTitle.setText("MASTER, SPANK ME!");
            }

        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FrenchQuiz.this,FrenchQuizPlayer.class));
                finish();
            }
        });


    }
}
