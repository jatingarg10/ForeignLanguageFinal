package com.example.jatin.foreignlanguagefinal.French;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;

import com.example.jatin.foreignlanguagefinal.NavigationDrawer.AboutUs;
import com.example.jatin.foreignlanguagefinal.NavigationDrawer.LanguageChooser;
import com.example.jatin.foreignlanguagefinal.NavigationDrawer.Settings;
import com.example.jatin.foreignlanguagefinal.R;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by Jatin on 23-Apr-18.
 */

public class SelectionFrench extends AppCompatActivity {
    GridLayout mainGrid;

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_french);
        //this.getSupportActionBar().setDisplayShowTitleEnabled(false);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        setSingleEvent(mainGrid);

        setUpToolbar();

        navigationView = (NavigationView) findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.language:
                        startActivity(new Intent(SelectionFrench.this, LanguageChooser.class));
                        finish();
                        break;
                    case R.id.settings:
                        startActivity(new Intent(SelectionFrench.this,Settings.class));
                        finish();
                        break;

                    case R.id.about_us:
                        startActivity(new Intent(SelectionFrench.this,AboutUs.class));
                        finish();
                        break;
                }


                return false;
            }
        });

    }

    private void setUpToolbar() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }


    private void setSingleEvent(GridLayout mainGrid) {

        for (int i=0;i<mainGrid.getChildCount();i++)
        {
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finali = i;

            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (finalI ==0)
                    {
                        startActivity(new Intent(SelectionFrench.this, FrenchMainLearn.class));
                    }
                    if(finalI==1)
                    {
                        startActivity(new Intent(SelectionFrench.this, FrenchFacts.class));
                    }
                    if (finalI ==2)
                    {
                        startActivity(new Intent(SelectionFrench.this, FrenchQuiz.class));
                    }
                    if(finalI==3)
                    {
                        startActivity(new Intent(SelectionFrench.this, FrenchBooks.class));
                    }

                }
            });
        }
    }

}
