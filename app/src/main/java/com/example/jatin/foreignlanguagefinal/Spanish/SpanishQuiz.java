package com.example.jatin.foreignlanguagefinal.Spanish;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jatin.foreignlanguagefinal.R;

public class SpanishQuiz extends AppCompatActivity {

    Button quizButton;
    TextView spanishPreviousScore;
    TextView spanishQuizTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanish_quiz);

        spanishPreviousScore = findViewById(R.id.spanishPreviousScore);
        spanishQuizTitle = findViewById(R.id.spanishQuizTitle);
        quizButton = findViewById(R.id.spanishQuizButton);

        SharedPreferences sp = getSharedPreferences("MyPrefsScoreSpanish", 0);
        int prevScore = sp.getInt("PREVIOUS_SCORE_SPANISH",0);
        String realScore = String.valueOf(prevScore);
        //int prevScore = sp.getInt("PREVIOUS_SCORE", 0);
        spanishPreviousScore.setText("Previous Score: " + realScore);

        if(prevScore>=0 &&prevScore<5)
        {
            spanishQuizTitle.setText("NOOB");
        }
        else if (prevScore>=5 &&prevScore<10)
        {
            spanishQuizTitle.setText("BEGINNER");
        }
        else if (prevScore>=10 &&prevScore<15)
        {
            spanishQuizTitle.setText("INTERMEDIATE");
        }
        else if (prevScore>=15 &&prevScore<20)
        {
            spanishQuizTitle.setText("EXPERT");
        }
        else
        {
            spanishQuizTitle.setText("MASTER, SPANK ME!");
        }

        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SpanishQuiz.this,SpanishQuizPlayer.class));
                finish();
            }
        });
    }
}
