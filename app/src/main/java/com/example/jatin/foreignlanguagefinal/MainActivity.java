package com.example.jatin.foreignlanguagefinal;

import android.content.Intent;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.jatin.foreignlanguagefinal.NavigationDrawer.AboutUs;
import com.example.jatin.foreignlanguagefinal.NavigationDrawer.LanguageChooser;
import com.example.jatin.foreignlanguagefinal.NavigationDrawer.Settings;


public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpToolbar();

        navigationView = (NavigationView) findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.language:
                        startActivity(new Intent(MainActivity.this, LanguageChooser.class));
                        break;
                    case R.id.settings:
                        startActivity(new Intent(MainActivity.this,Settings.class));
                        break;

                    case R.id.about_us:
                        startActivity(new Intent(MainActivity.this,AboutUs.class));
                        break;
                }


                return false;
            }
        });

    }

    private void setUpToolbar() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }




}
