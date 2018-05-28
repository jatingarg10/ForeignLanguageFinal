package com.example.jatin.foreignlanguagefinal.German;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jatin.foreignlanguagefinal.French.FrenchQuiz;
import com.example.jatin.foreignlanguagefinal.French.FrenchQuizPlayer;
import com.example.jatin.foreignlanguagefinal.R;

public class GermanQuiz extends AppCompatActivity {

    Button quizButton;
    TextView germanPreviousScore;
    TextView germanQuizTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_german_quiz);

        germanPreviousScore = findViewById(R.id.germanPreviousScore);
        germanQuizTitle = findViewById(R.id.germanQuizTitle);
        quizButton = findViewById(R.id.germanQuizButton);

        SharedPreferences sp = getSharedPreferences("MyPrefsScoreGerman", 0);
        int prevScore = sp.getInt("PREVIOUS_SCORE_GERMAN",0);
        String realScore = String.valueOf(prevScore);

        germanPreviousScore.setText("Previous Score: " + realScore);

        if(prevScore>=0 &&prevScore<5)
        {
            germanQuizTitle.setText("NOOB");
        }
        else if (prevScore>=5 &&prevScore<10)
        {
            germanQuizTitle.setText("BEGINNER");
        }
        else if (prevScore>=10 &&prevScore<15)
        {
            germanQuizTitle.setText("INTERMEDIATE");
        }
        else if (prevScore>=15 &&prevScore<20)
        {
            germanQuizTitle.setText("EXPERT");
        }
        else
        {
            germanQuizTitle.setText("MASTER, SPANK ME!");
        }

        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GermanQuiz.this,GermanQuizPlayer.class));
                finish();
            }
        });
    }
}
