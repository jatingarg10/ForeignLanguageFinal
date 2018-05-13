package com.example.jatin.foreignlanguagefinal.French;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.jatin.foreignlanguagefinal.MainActivity;
import com.example.jatin.foreignlanguagefinal.R;

public class FrenchMainLearn extends AppCompatActivity implements RecyclerAdapterFrench.ListItemClickListener {

    String[] categories = {"Numbers", "Family Members", "Colors", "Phrases", "Weeks", "Months", "Photo Gallery", "Blah1"};
    //String[] color = {"#ffd700","#228b22","#ffff00","#8b4513","#9370db","#0000ff","#ffdead"};
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_main_learn);

        recycler = findViewById(R.id.recyclerFrench);

        RecyclerAdapterFrench recyclerAdapterFrench = new RecyclerAdapterFrench(categories, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recycler.setAdapter(recyclerAdapterFrench);
        recycler.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void onListItemClick(View view, int position) {

        Context context = view.getContext();
        Intent intent = new Intent();

        switch (position) {
            case 0:
                intent = new Intent(context, FrenchMainNumbers.class);
                context.startActivity(intent);
                break;

            //Toast.makeText(this,position+1 + " Item Clicked " + categories[position],Toast.LENGTH_SHORT).show();


        }
    }
}
