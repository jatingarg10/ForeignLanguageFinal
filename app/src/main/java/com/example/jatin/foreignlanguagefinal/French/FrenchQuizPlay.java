package com.example.jatin.foreignlanguagefinal.French;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.jatin.foreignlanguagefinal.R;

public class FrenchQuizPlay extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_quiz_play);
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.frenchQuizNavView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment selectedFragment = null;
                switch (item.getItemId())
                {
                    case R.id.action_category:
                        selectedFragment = CategoryFragmentQuiz.newInstance();
                        break;

                    case R.id.action_ranking:
                        selectedFragment = RankingFragmentQuiz.newInstance();
                        break;
                }
                android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                //transaction.replace(R.id.,selectedFragment);
                transaction.commit();
                return true;
            }

        });
        setDefaultFragment();
    }

    private void setDefaultFragment() {

        android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        //transaction.replace(R.id.frame_layout,CategoryFragmentQuiz.newInstance());
        transaction.commit();

    }
    }

