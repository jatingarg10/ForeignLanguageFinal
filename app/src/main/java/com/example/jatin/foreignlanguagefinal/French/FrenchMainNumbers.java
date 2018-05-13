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
    String[] imageURL = {"https://www.flaticon.com/free-icon/one_188234",
            "https://www.flaticon.com/free-icon/two_188235",
            "https://www.flaticon.com/free-icon/three_188236",
            "https://www.flaticon.com/free-icon/four_188237",
            "https://www.flaticon.com/free-icon/five_188238",
            "https://www.flaticon.com/free-icon/six_188239",
            "https://www.flaticon.com/free-icon/seven_188240",
            "https://www.flaticon.com/free-icon/eight_188241",
            "https://www.flaticon.com/free-icon/nine_188242",
            "https://www.flaticon.com/free-icon/ten_188243",
            "https://www.flaticon.com/free-icon/eleven_188244",
            "https://www.flaticon.com/free-icon/twelve_188245",
            "https://www.flaticon.com/free-icon/thirteen_188246",
            "https://www.flaticon.com/free-icon/fourteen_188247",
            "https://www.flaticon.com/free-icon/fifteen_188248",
            "https://www.flaticon.com/free-icon/four_188249",
            "https://www.flaticon.com/free-icon/four_188250",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",};
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
