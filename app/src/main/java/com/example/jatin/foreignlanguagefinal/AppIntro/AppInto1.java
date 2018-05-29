package com.example.jatin.foreignlanguagefinal.AppIntro;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;

import com.example.jatin.foreignlanguagefinal.GoogleLogin;
import com.example.jatin.foreignlanguagefinal.R;
import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class AppInto1 extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("Foreign Language",
                "Learn Francais",
                R.drawable.france,
                Color.parseColor("#FFC107")));

        addSlide(AppIntroFragment.newInstance("Foreign Language",
                "Learn Español",
                R.drawable.spain,
                Color.parseColor("#4fd7ff")));

        addSlide(AppIntroFragment.newInstance("Foreign Language",
                "Learn Deutsche",
                R.drawable.germany,
                Color.parseColor("#795548")));

        showStatusBar(false);
        setBarColor(Color.parseColor("#333639"));
        setSeparatorColor(Color.parseColor("#2196F3"));
    }

    @Override
    public void onDonePressed() {
       startActivity(new Intent(this, GoogleLogin.class));
        /*SharedPreferences getPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        SharedPreferences.Editor e = getPrefs.edit();
        e.putBoolean("firstStart", false);
        e.apply();*/
       finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        startActivity(new Intent(this, GoogleLogin.class));
        finish();
    }

    /*@Override
    public void onSlideChanged() {

    }*/
}
