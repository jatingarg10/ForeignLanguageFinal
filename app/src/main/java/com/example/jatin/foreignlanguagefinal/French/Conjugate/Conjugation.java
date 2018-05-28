package com.example.jatin.foreignlanguagefinal.French.Conjugate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.webkit.WebView;
import android.widget.GridLayout;

import com.example.jatin.foreignlanguagefinal.R;

public class Conjugation extends AppCompatActivity {
    GridLayout mainGrid;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conjugation);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
    }
    private void setSingleEvent(GridLayout mainGrid) {

        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finali = i;

            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (finalI == 0) {
                        startActivity(new Intent(Conjugation.this, Avoir.class));
                    }
                    if (finalI == 1) {
                        startActivity(new Intent(Conjugation.this, Finir.class));
                    }
                    if (finalI == 2) {
                        startActivity(new Intent(Conjugation.this, Etre.class));
                    }
                    if (finalI == 3) {
                        startActivity(new Intent(Conjugation.this, Lire.class));
                    }
                    if (finalI == 4) {
                        startActivity(new Intent(Conjugation.this, Aller.class));
                    }
                    if (finalI == 5) {
                        startActivity(new Intent(Conjugation.this, Parler.class));
                    }


                }
            });

        }
    }
}

