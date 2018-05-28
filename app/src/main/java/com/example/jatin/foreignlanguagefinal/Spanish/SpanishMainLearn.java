package com.example.jatin.foreignlanguagefinal.Spanish;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.jatin.foreignlanguagefinal.French.FrenchMainColor;
import com.example.jatin.foreignlanguagefinal.French.FrenchMainDays;
import com.example.jatin.foreignlanguagefinal.French.FrenchMainFamily;
import com.example.jatin.foreignlanguagefinal.French.FrenchMainMonths;
import com.example.jatin.foreignlanguagefinal.French.FrenchMainNumbers;
import com.example.jatin.foreignlanguagefinal.French.FrenchMainPhrases;
import com.example.jatin.foreignlanguagefinal.French.RecyclerAdapterFrench;
import com.example.jatin.foreignlanguagefinal.R;

public class SpanishMainLearn extends AppCompatActivity implements RecyclerAdapterSpanish.ListItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanish_main_learn);

        String[] categories = {"Numbers", "Family Members", "Colors", "Phrases", "Days Of Week", "Months", "Photo Gallery"};
        String[] color = {"#FFA500","#32CD32","#9400D3","#87CEEB","#8B4513","#2F4F4F","#FFFF00"};
        RecyclerView recycler;

        recycler = findViewById(R.id.recyclerSpanish);

        RecyclerAdapterSpanish ras = new RecyclerAdapterSpanish(categories,color, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recycler.setAdapter(ras);
        recycler.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void onListItemClick(View view, int position) {

        Context context = view.getContext();
        Intent intent = new Intent();

        switch (position) {
            case 0:
                intent = new Intent(context, SpanishMainNumber.class);
                context.startActivity(intent);
                break;
            case 1:
                intent = new Intent(context, SpanishMainFamily.class);
                context.startActivity(intent);
                break;
            case 2:
                intent = new Intent(context, SpanishMainColors.class);
                context.startActivity(intent);
                break;
            case 3:
                intent = new Intent(context, SpanishMainPhrases.class);
                context.startActivity(intent);
                break;
            case 4:
                intent = new Intent(context, SpanishMainDays.class);
                context.startActivity(intent);
                break;
            case 5:
                intent = new Intent(context, SpanishMainMonths.class);
                context.startActivity(intent);
                break;
            default:
                break;
        }
    }
}
