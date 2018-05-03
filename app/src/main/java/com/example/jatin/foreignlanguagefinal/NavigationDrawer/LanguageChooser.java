package com.example.jatin.foreignlanguagefinal.NavigationDrawer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import com.example.jatin.foreignlanguagefinal.French.SelectionFrench;
import com.example.jatin.foreignlanguagefinal.German.SelectionGerman;
import com.example.jatin.foreignlanguagefinal.MainActivity;
import com.example.jatin.foreignlanguagefinal.OptionMenu.DayNight;
import com.example.jatin.foreignlanguagefinal.OptionMenu.Logout;
import com.example.jatin.foreignlanguagefinal.OptionMenu.Share;
import com.example.jatin.foreignlanguagefinal.R;
import com.example.jatin.foreignlanguagefinal.Spanish.SelectionSpanish;

public class LanguageChooser extends AppCompatActivity {

    Button frenchBtn;
    Button spanishBtn;
    Button germanBtn;

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



        setUpToolbar();

        navigationView = (NavigationView) findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    /*case R.id.language:
                        startActivity(new Intent(LanguageChooser.this, LanguageChooser.class));
                        finish();
                        break;*/
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
                startActivity(new Intent(LanguageChooser.this,DayNight.class));
                break;
            case R.id.share:
                startActivity(new Intent(LanguageChooser.this,Share.class));
                break;
            case R.id.logout11:
                startActivity(new Intent(LanguageChooser.this,Logout.class));
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
