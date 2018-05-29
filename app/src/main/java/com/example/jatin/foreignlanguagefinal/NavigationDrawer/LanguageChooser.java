package com.example.jatin.foreignlanguagefinal.NavigationDrawer;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.example.jatin.foreignlanguagefinal.French.SelectionFrench;
import com.example.jatin.foreignlanguagefinal.German.SelectionGerman;
import com.example.jatin.foreignlanguagefinal.GoogleLogin;
import com.example.jatin.foreignlanguagefinal.R;
import com.example.jatin.foreignlanguagefinal.Spanish.SelectionSpanish;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class LanguageChooser extends AppCompatActivity {

    Button frenchBtn;
    Button spanishBtn;
    Button germanBtn;
    //Button translateBtn;

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_chooser);

        frenchBtn = (Button) findViewById(R.id.frenchBtn);
        spanishBtn = (Button) findViewById(R.id.spanishBtn);
        germanBtn = (Button) findViewById(R.id.germanBtn);
        //translateBtn = (Button) findViewById(R.id.translateBtn);

        frenchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LanguageChooser.this,SelectionFrench.class));
            }
        });

        spanishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LanguageChooser.this,SelectionSpanish.class));
            }
        });

        germanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LanguageChooser.this,SelectionGerman.class));
            }
        });

       /* translateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LanguageChooser.this,Translate.class));
            }
        });*/

        setUpToolbar();

        navigationView = (NavigationView) findViewById(R.id.navigation_menu);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        TextView userName = (TextView)navigationView.getHeaderView(0).findViewById(R.id.headerName);
        userName.setText(acct.getDisplayName());
        ImageView mPic = (ImageView) navigationView.getHeaderView(0).findViewById(R.id.headerImage);
        mPic.setImageURI(acct.getPhotoUrl());

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.translate:
                        startActivity(new Intent(LanguageChooser.this, Translate.class));
                        finish();
                        break;

                    case R.id.settings:
                        startActivity(new Intent(LanguageChooser.this,Settings.class));
                        finish();
                        break;

                    case R.id.about_us:
                        startActivity(new Intent(LanguageChooser.this,AboutUs.class));
                        finish();
                        break;
                }


                return false;
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.setting_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.dayNight:


                break;
            case R.id.share:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Hey check out my app at: Sent from Foreign Language as Share Feature/*https://play.google.com/store/apps/details?id=com.google.android.apps.plus*/");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

                return true;
            case R.id.logout11:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setMessage("Do you really want to close this application ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                startActivity(new Intent(LanguageChooser.this, GoogleLogin.class));
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert = builder.create();
                alert.setTitle("Logout");
                alert.show();

                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setUpToolbar() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Choose Language");
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }




}
