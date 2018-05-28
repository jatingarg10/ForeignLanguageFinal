package com.example.jatin.foreignlanguagefinal.German;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.jatin.foreignlanguagefinal.R;

public class GermanMainLearn extends AppCompatActivity implements RecyclerAdapterGerman.ListItemClickListener {

    String[] categories = {"Numbers", "Family Members", "Colors", "Phrases", "Days Of Week", "Months", "Photo Gallery"};
    String[] color = {"#FFA500", "#32CD32", "#9400D3", "#87CEEB", "#8B4513", "#2F4F4F", "#FFFF00"};
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_german_main_learn);

        recycler = findViewById(R.id.recyclerGerman);

        RecyclerAdapterGerman rag = new RecyclerAdapterGerman(categories, color, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recycler.setAdapter(rag);
        recycler.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void onListItemClick(View view, int position) {
        Context context = view.getContext();
        Intent intent = new Intent();

        switch (position) {
            case 0:
                intent = new Intent(context, GermanMainNumbers.class);
                context.startActivity(intent);
                break;
            case 1:
                intent = new Intent(context, GermanMainFamily.class);
                context.startActivity(intent);
                break;
            case 2:
                intent = new Intent(context, GermanMainColors.class);
                context.startActivity(intent);
                break;
            case 3:
                intent = new Intent(context, GermanMainPhrases.class);
                context.startActivity(intent);
                break;
            case 4:
                intent = new Intent(context, GermanMainDays.class);
                context.startActivity(intent);
                break;
            case 5:
                intent = new Intent(context, GermanMainMonths.class);
                context.startActivity(intent);
                break;
            default:
                break;
        }
    }
}
