package com.example.jatin.foreignlanguagefinal.German;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.jatin.foreignlanguagefinal.R;
import java.util.Random;

public class GermanQuizPlayer extends AppCompatActivity {
    Button answer1, answer2, answer3,answer4;
    TextView germanScore, germanQuestion;

    private GermanQuestions questions = new GermanQuestions();

    private String mAnswer ;
    private int score = 0;
    private int mQuestionLength = questions.mQuestions.length;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_german_quiz_player);

        random = new Random();

        answer1 = findViewById(R.id.germanButton1);
        answer2 = findViewById(R.id.germanButton2);
        answer3 = findViewById(R.id.germanButton3);
        answer4 = findViewById(R.id.germanButton4);

        germanScore = findViewById(R.id.germanScore);
        germanQuestion = findViewById(R.id.germanQuestions);

        germanScore.setText("Score: " + score);
        updateQuestion(random.nextInt(mQuestionLength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer1.getText() == mAnswer)
                {
                    score++;
                    germanScore.setText("Score: " + score);
                    updateQuestion(random.nextInt(mQuestionLength));
                }
                else
                {
                    gameOver();
                    Toast.makeText(GermanQuizPlayer.this,"Wrong Answer",Toast.LENGTH_SHORT).show();
                }

            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer2.getText() == mAnswer)
                {
                    score++;
                    germanScore.setText("Score: " + score);
                    updateQuestion(random.nextInt(mQuestionLength));
                }
                else
                {
                    gameOver();
                    Toast.makeText(GermanQuizPlayer.this,"Wrong Answer",Toast.LENGTH_SHORT).show();
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer3.getText() == mAnswer)
                {
                    score++;
                    germanScore.setText("Score: " + score);
                    updateQuestion(random.nextInt(mQuestionLength));
                }
                else
                {
                    gameOver();
                    Toast.makeText(GermanQuizPlayer.this,"Wrong Answer",Toast.LENGTH_SHORT).show();
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer4.getText() == mAnswer)
                {
                    score++;
                    germanScore.setText("Score: " + score);
                    updateQuestion(random.nextInt(mQuestionLength));
                }
                else
                {
                    gameOver();
                    Toast.makeText(GermanQuizPlayer.this,"Wrong Answer",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void updateQuestion(int num)
    {
        germanQuestion.setText(questions.getQuestion(num));
        answer1.setText(questions.getChoice1(num));
        answer2.setText(questions.getChoice2(num));
        answer3.setText(questions.getChoice3(num));
        answer4.setText(questions.getChoice4(num));

        mAnswer = questions.getAnswer(num);

    }

    private void gameOver()
    {
        SharedPreferences sp = getSharedPreferences("MyPrefsScoreGerman", 0);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("PREVIOUS_SCORE_GERMAN",score);
        editor.commit();

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setMessage("Your Score Is - " + score + " Points")
                .setTitle("GAME OVER!")
                .setIcon(R.drawable.gameover)
                .setCancelable(false)
                .setPositiveButton("NEW GAME", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(),GermanQuizPlayer.class));
                    }
                })
                .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(GermanQuizPlayer.this,SelectionGerman.class));
                        finish();
                    }
                });

        AlertDialog alertDialog = dialog.create();
        alertDialog.show();

    }
}
