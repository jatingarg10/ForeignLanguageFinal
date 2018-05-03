package com.example.jatin.foreignlanguagefinal.French;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jatin.foreignlanguagefinal.MainActivity;
import com.example.jatin.foreignlanguagefinal.R;

public class FrenchMainLearn extends AppCompatActivity implements RecyclerAdapterFrench.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_main_learn);

        RecyclerView recyclerFrench = (RecyclerView) findViewById(R.id.recyclerFrench);
        recyclerFrench.setLayoutManager(new LinearLayoutManager(this));

        String[] categories = {"Numbers","Family Members", "Colors", "Phrases", "Weeks", "Months","Photo Gallery"};

        RecyclerAdapterFrench recyclerAdapterFrench = new RecyclerAdapterFrench(categories,this);

        recyclerFrench.setAdapter(recyclerAdapterFrench);

       // RecyclerAdapterFrench mRecyclerAdapterFrench = new RecyclerAdapterFrench(FrenchMainLearn.this,categories);

       // RecyclerAdapterFrench.OnItemClickListener(FrenchMainLearn.this);

        recyclerAdapterFrench.setOnItemClickListener(FrenchMainLearn.this);



    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(FrenchMainLearn.this, MainActivity.class);



    }
}
