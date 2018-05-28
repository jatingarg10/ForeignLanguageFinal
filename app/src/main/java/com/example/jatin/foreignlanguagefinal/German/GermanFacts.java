package com.example.jatin.foreignlanguagefinal.German;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.jatin.foreignlanguagefinal.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GermanFacts extends AppCompatActivity {

    ArrayList<String> facts;
    ImageView imageFacts;
    TextView textFacts;
    Button nextFact;
    Map<String, Integer> mapFacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_german_facts);

        imageFacts = (ImageView) findViewById(R.id.imageFact);
        textFacts = (TextView) findViewById(R.id.textFact);
        nextFact = (Button) findViewById(R.id.nextFact);

        mapFacts = new HashMap<>();

        //mapFacts.put("With 81 million people Germany has the largest population in the European Union. She is one of the most densely populated countries in the world.", R.drawable.germanfacts1);
        mapFacts.put("One third of the country is still covered in forests and woodlands.", R.drawable.germanfacts19);
        mapFacts.put("Germany is composed of sixteen states. The states have their own constitution and are largely autonomous in regard to their internal organization. At the municipal level, Germany is divided into 403 districts (Kreise), of which 301 are rural districts and 102 urban districts. Bavaria is the largest state.", R.drawable.germanfacts2);
        mapFacts.put("Germany is the EU’s largest economy – with a gross domestic product (GDP) of 3.73 trillion USD,  and lies fourth place in the world behind the US, China and Japan.", R.drawable.germanfacts3);
        mapFacts.put("Germany is one of the world’s largest car producers – selling 5.9 million cars in 2011. VW’s Golf is one of the best selling cars of all time: in 2012 it year it sold more than 430,000 Golfs around Europe (125,000 ahead of its nearest rival). In 2013, the top-selling car brands in Germany were Volkswagen, Mercedes. Audi and BMWds", R.drawable.germanfacts4);
        mapFacts.put("The first printed book was in German. Germany is one of the world’s leading book nations – publishing around 94,000 titles every year.", R.drawable.germanfacts5);
        mapFacts.put("Germany was the first country in the world to adopt Daylight saving time – DST, also known as summer time. This occured in 1916, in the midst of WWI.", R.drawable.germanfacts6);
        mapFacts.put("German is the most widely taught third language across the world.", R.drawable.germanfacts7);
        mapFacts.put("Donaudampfschifffahrtselektrizitätenhauptbetriebswerkbauunterbeamtengesellschaft is the longest word to be published. It is 79 letters long.", R.drawable.germanfacts8);
        mapFacts.put("College is free for everyone (even non-Germans).", R.drawable.germanfacts9);
        mapFacts.put("Beer is considered as a food in Bavaria officially. There are over 1,500 different beers in Germany. After the Irish, the Germans are those consume the most beer, making Germany the second largest consumer of Beer.", R.drawable.germanfacts10);
        mapFacts.put("To get ONE beer in Germany, you show your thumb. To show your first finger means that you want 2 beers: one with the thumb, and one with the finger.", R.drawable.germanfacts11);
        mapFacts.put("There are more football (soccer for the North Americans) fan clubs in Germany than anywhere else in the world.", R.drawable.germanfacts12);
        mapFacts.put("The Christmas tree (Tannenbaum) tradition came from Germany.", R.drawable.germanfacts13);
        mapFacts.put("Germany has over 400 zoos, the most in the world.", R.drawable.germanfacts14);
        mapFacts.put("Most taxis in Germany are Mercedes.", R.drawable.germanfacts15);
        mapFacts.put("In Germany there’s no punishment for a prisoner who tries to escape from jail, because it is a basic human instinct to be free.", R.drawable.germanfacts16);
        mapFacts.put("Albert Einstein, the most recognized scientist in the world, was German and born in Ulm.\n", R.drawable.germanfacts17);
        mapFacts.put("Adidas was founded by the Bavarian, Adolf “Adi”Dassler. His other brother, Rudolf Dassler founded Puma.", R.drawable.germanfacts18);


        nextFact.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Random random = new Random();
                int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));

                //String holder = facts.get(random.nextInt(facts.size()));

                textFacts.setMovementMethod(new ScrollingMovementMethod());

                int i = random.nextInt(mapFacts.size());
                Object[] keys = mapFacts.keySet().toArray();
                String text = (String) keys[i];
                int id = mapFacts.get(keys[i]);
                textFacts.setText(text);
                textFacts.setTextColor(color);
                Glide.with(getApplicationContext()).load(id).into(imageFacts);
            }
        });
    }
}
