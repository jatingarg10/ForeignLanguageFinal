package com.example.jatin.foreignlanguagefinal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jatin.foreignlanguagefinal.AppIntro.AppInto1;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent  = new Intent(SplashActivity.this, GoogleLogin.class);
                startActivity(intent);
                finish();
            }
        }, 2500);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                SharedPreferences shaPref = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
                boolean isFirstStart = shaPref.getBoolean("FirstStart", true);
                if(isFirstStart)
                {
                    startActivity(new Intent(SplashActivity.this, AppInto1.class));
                    SharedPreferences.Editor e = shaPref.edit();
                    e.putBoolean("FirstStart", false);
                    e.apply();
                }
            }
        });

        thread.start();




    }
}
