package com.example.jatin.foreignlanguagefinal.French;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.jatin.foreignlanguagefinal.R;

public class FrenchMainGallery extends AppCompatActivity implements RecyclerAdapterFrenchGallery.ListItemClickListener{

    int[] frenchGallery =
            {R.drawable.francegallery1,
                    R.drawable.francegallery2,
                    R.drawable.francegallery3,
                    R.drawable.francegallery4,
                    R.drawable.francegallery5,
                    R.drawable.francegallery6,
                    R.drawable.francegallery7,
                    R.drawable.francegallery8,
                    R.drawable.francegallery9,
                    R.drawable.francegallery10};

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_main_gallery);

        recyclerView = findViewById(R.id.recyclerFrenchGallery);
        RecyclerAdapterFrenchGallery rafg = new RecyclerAdapterFrenchGallery(frenchGallery,this,getApplicationContext());
        GridLayoutManager rlm = new GridLayoutManager(this,2);

        recyclerView.setAdapter(rafg);
        recyclerView.setLayoutManager(rlm);
    }

    @Override
    public void onClickListener(View view, int position) {
        /*switch (position)
        {
            case 0:
                Toast.makeText(FrenchMainGallery.this,"Position" + position, Toast.LENGTH_SHORT).show();
                break;
        }*/

        for (int i=0; i<position; i++)
        {
            Toast.makeText(FrenchMainGallery.this,"Position" + position, Toast.LENGTH_SHORT).show();
        }

    }
}
