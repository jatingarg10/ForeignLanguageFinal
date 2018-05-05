package com.example.jatin.foreignlanguagefinal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jatin.foreignlanguagefinal.AppIntro.AppInto1;
import com.example.jatin.foreignlanguagefinal.NavigationDrawer.LanguageChooser;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.auth.FirebaseAuth;

public class GoogleLogin extends AppCompatActivity {

   Button skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_login);

        Button skip = (Button) findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(this,NavigationDrawer.class));
                Intent Intent = new Intent(view.getContext(), LanguageChooser.class);
                view.getContext().startActivity(Intent);
                finish();
            }
        });


    }



}
