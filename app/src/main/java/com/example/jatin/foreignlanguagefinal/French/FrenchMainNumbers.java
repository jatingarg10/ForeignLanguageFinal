package com.example.jatin.foreignlanguagefinal.French;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.jatin.foreignlanguagefinal.R;

public class FrenchMainNumbers extends AppCompatActivity implements RecyclerAdapterFrenchNumbers.ListItemClickListenerNumbers {

    String[] numbers = {"Uh", "Deux", "Trois", "Quatre", "Cinq", "Six", "Sept", "Huit", "Neuf", "Dix", "Onze", "Douze", "Treize", "Quatorz", "Quinze"};
    RecyclerView recylerNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_main_numbers);

        recylerNumbers = findViewById(R.id.recyclerMainNumbers);

        RecyclerAdapterFrenchNumbers recyclerAdapterFrenchNumbers = new RecyclerAdapterFrenchNumbers(numbers, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recylerNumbers.setAdapter(recyclerAdapterFrenchNumbers);
        recylerNumbers.setLayoutManager(linearLayoutManager);

    }

    @Override
    public void onListItemClick(View view, int position) {

        Toast.makeText(this,position+1 + " Item Clicked " + numbers[position], Toast.LENGTH_SHORT).show();

        /*Context context = view.getContext();


        switch (position) {
            case 0:
                Toast.makeText(this,position+1 + " Item Clicked " + numbers[position], Toast.LENGTH_SHORT).show();




        }*/
    }
}
