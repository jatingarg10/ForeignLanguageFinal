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

    String[] categories = {"Numbers", "Family Members", "Colors", "Phrases", "Days Of Week", "Months", "Photo Gallery"};
    String[] color = {"#FFA500","#32CD32","#9400D3","#87CEEB","#8B4513","#2F4F4F","#FFFF00"};
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_main_learn);

        recycler = findViewById(R.id.recyclerFrench);

        RecyclerAdapterFrench recyclerAdapterFrench = new RecyclerAdapterFrench(categories,color, this);
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
            case 1:
                intent = new Intent(context,FrenchMainFamily.class);
                context.startActivity(intent);
                break;
            case 2:
                intent = new Intent(context,FrenchMainColor.class);
                context.startActivity(intent);
                break;
            case 3:
                intent = new Intent(context,FrenchMainPhrases.class);
                context.startActivity(intent);
                break;
            case 4:
                intent = new Intent(context,FrenchMainDays.class);
                context.startActivity(intent);
                break;
            case 5:
                intent = new Intent(context,FrenchMainMonths.class);
                context.startActivity(intent);
                break;
            default:
                break;
            case 6:
                intent = new Intent(context,FrenchMainGallery.class);
                context.startActivity(intent);
                break;


        }
    }
}
