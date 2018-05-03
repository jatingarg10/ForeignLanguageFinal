package com.example.jatin.foreignlanguagefinal.French;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jatin.foreignlanguagefinal.R;

public class FrenchMainNumbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_main_numbers);

        RecyclerView mainNumber = (RecyclerView) findViewById(R.id.recyclerMainNumbers1);
        mainNumber.setLayoutManager(new LinearLayoutManager(this));

        String[] list = {"Uh", "Deux","Trois","Quatre","Cinq","Six","Sept","Huit","Neuf","Dix","Onze","Douze","Treize","Quatorz","Quinze"};

        mainNumber.setAdapter(new RecyclerAdapterFrenchNumbers(list,this));

    }
}
