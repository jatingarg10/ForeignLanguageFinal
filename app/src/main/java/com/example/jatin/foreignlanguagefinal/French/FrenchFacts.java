package com.example.jatin.foreignlanguagefinal.French;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.example.jatin.foreignlanguagefinal.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FrenchFacts extends AppCompatActivity {

    ArrayList<String> facts;
    ImageView imageFacts;
    TextView textFacts;
    Button nextFact;
    Map<String,Integer> mapFacts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_facts);

        imageFacts = (ImageView) findViewById(R.id.imageFact);
        textFacts = (TextView) findViewById(R.id.textFact);
        nextFact = (Button) findViewById(R.id.nextFact);

        facts = new ArrayList<>();

        mapFacts = new HashMap<>();
        mapFacts.put("France is the world's most popular tourist destination – some 83.7 million visitors arrived in France, according to the World Tourism Organization report published in 2014, making it the world's most-visited country.",R.drawable.frances1);
        mapFacts.put("France is the largest country in the EU, and known as 'the hexagon' – with an area of 551,000 sq km it's almost a fifth of the EU’s total area, and due to its six-sided shape France is sometimes referred to as l’hexagone. About a quarter is covered by forest; only Sweden and Finland have more.",R.drawable.frances2 );
        mapFacts.put("Louis XIX was the king of France for just 20 minutes, the shortest ever reign – he ascended to the French throne in July 1830 after his father Charles X abdicated, and abdicated himself 20 minutes later in favour of his nephew, the Duke of Bordeaux.",R.drawable.frances3);
        mapFacts.put("Liberté, égalitié, fraternité meaning ‘liberty, equality and fraternity’ (or brotherhood) is the national motto of France – it first appeared around the time of the Revolution (1789–1799), and was written into the constitutions of 1946 and 1958. Today you’ll see it on coins, postage stamps and government logos often alongside ‘Marianne’ who symbolises the ‘triumph of the Republic’.",R.drawable.frances4);
        mapFacts.put("The French Army was the first to use camouflage in 1915 (World War I) – the word camouflage came from the French verb ‘to make up for the stage’. Guns and vehicles were painted by artists called camofleurs.",R.drawable.frances5);
        mapFacts.put("In France you can marry a dead person – under French law, in exceptional cases you can marry posthumously, as long as you can also prove that the deceased had the intention of marrying while alive and you receive permission from the French president.",R.drawable.frances6);
        mapFacts.put("France was the first country in the world to ban supermarkets from throwing away or destroying unsold food – since February 2016, shops must donate wastage to food banks or charities.",R.drawable.frances7);
        mapFacts.put("The Académie Française has aimed to preserve the French language since 1634 – by attempting to ban, somewhat unsuccessfully, foreign words such as blog, hashtag, parking, email and weekend. It was started by a small group of French intellects and officially recognised by Louis XIII in 1635.",R.drawable.frances8);
        mapFacts.put("At least 40 percent of the music on private radio stations must be of French origin – since 1996, the country’s top media regulator the Conseil Supérieur de L’Audiovisuel (CSA) has been charged with enforcing this French law. The CSA also requires half of the French music quota to be less than six months old.",R.drawable.frances9);
        mapFacts.put("France legalised same-sex marriage in 2013 – when President Françoise Holland signed the bill into law on 18 May 2013, France became the ninth country in Europe and 14th in the world to legalise same-sex marriage.",R.drawable.frances10);
       /* mapFacts.put("",R.drawable.);
        mapFacts.put("",R.drawable.);
        mapFacts.put("",R.drawable.);*/



        //facts.add("France is the world's most popular tourist destination – some 83.7 million visitors arrived in France, according to the World Tourism Organization report published in 2014, making it the world's most-visited country.");
        //facts.add("France is the largest country in the EU, and known as 'the hexagon' – with an area of 551,000 sq km it's almost a fifth of the EU’s total area, and due to its six-sided shape France is sometimes referred to as l’hexagone. About a quarter is covered by forest; only Sweden and Finland have more.");
        //facts.add("Louis XIX was the king of France for just 20 minutes, the shortest ever reign – he ascended to the French throne in July 1830 after his father Charles X abdicated, and abdicated himself 20 minutes later in favour of his nephew, the Duke of Bordeaux.");
        //facts.add("Liberté, égalitié, fraternité meaning ‘liberty, equality and fraternity’ (or brotherhood) is the national motto of France – it first appeared around the time of the Revolution (1789–1799), and was written into the constitutions of 1946 and 1958. Today you’ll see it on coins, postage stamps and government logos often alongside ‘Marianne’ who symbolises the ‘triumph of the Republic’.");
        //facts.add("The French Army was the first to use camouflage in 1915 (World War I) – the word camouflage came from the French verb ‘to make up for the stage’. Guns and vehicles were painted by artists called camofleurs.");
        //facts.add("In France you can marry a dead person – under French law, in exceptional cases you can marry posthumously, as long as you can also prove that the deceased had the intention of marrying while alive and you receive permission from the French president.");
        //facts.add("France was the first country in the world to ban supermarkets from throwing away or destroying unsold food – since February 2016, shops must donate wastage to food banks or charities.");
        //facts.add("The Académie Française has aimed to preserve the French language since 1634 – by attempting to ban, somewhat unsuccessfully, foreign words such as blog, hashtag, parking, email and weekend. It was started by a small group of French intellects and officially recognised by Louis XIII in 1635. ");
        //facts.add("At least 40 percent of the music on private radio stations must be of French origin – since 1996, the country’s top media regulator the Conseil Supérieur de L’Audiovisuel (CSA) has been charged with enforcing this French law. The CSA also requires half of the French music quota to be less than six months old.");
        //facts.add("France legalised same-sex marriage in 2013 – when President Françoise Holland signed the bill into law on 18 May 2013, France became the ninth country in Europe and 14th in the world to legalise same-sex marriage.");
        facts.add("Europe’s highest mountain is in the French Alps – Mont Blanc, at 4,810m, takes an arduous 10 to 12 hours to climb to the summit. Alternatively, you can take a leisurely 20-minute trip up on Europe’s highest cable car on the nearby Aiguille du Midi to get a brilliant view of Mont Blanc.\n");
        facts.add("The Louvre Museum in Paris was the most visited museum in the world in 2014 – with an amazing 9.3 million visitors, it received almost the same amount of people as the population of Sweden.");
        facts.add("The world’s first artificial heart transplant and face transplant both took place in France – the heart transplant occurred in December 2013 at the Georges Pompidou Hospital in Paris. The bioprosthetic device, which mimics a real heart’s contractions, is powered by external lithium-ion battery.");
        facts.add("Totalling around 29,000km, the French rail network is the second largest in Europe (after Germany) and the ninth biggest in the world – France was one of the world's first countries to utilise high-speed technology, introducing the TGV high-speed rail in 1981. The Tours-Bordeaux high-speed project, due for completion in 2017, will add a further 302km to the existing 1,550km.");
        facts.add("Paris Gare du Nord is Europe's busiest railway station – and by far, with some 190 million passengers passing through each year. Inaugurated in 1846, it it also one of the world's oldest stations.\n");
        facts.add("French wines can reach astronommical prices – in 2014, Sotheby’s sold a 114-bottle lot of DCR Romanee-Conti wines in Hong Kong for more than EUR 1.45m to an anonymous Asia-based buyer, a world record for a single wine lot. That works out to about EUR 1,619 per standard glass. ");


        nextFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();

                int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
                //String holder = facts.get(random.nextInt(facts.size()));
                textFacts.setMovementMethod(new ScrollingMovementMethod());


                //Collections.shuffle(mapFacts, new Random());


                for (Map.Entry<String,Integer> entry : mapFacts.entrySet()) {
                    String text = entry.getKey();
                    textFacts.append(text);
                    Log.d("lod",text);

                    textFacts.setTextColor(color);

                    int image = entry.getValue();
                    Log.d("lod",String.valueOf(image));
                    Glide.with(getApplicationContext())
                         .load(image)
                            .into(imageFacts);
                    //imageFacts.setImageResource(image);

                }

            }


        });
    }
}
