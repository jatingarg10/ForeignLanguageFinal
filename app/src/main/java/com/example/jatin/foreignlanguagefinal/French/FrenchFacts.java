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
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
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

        //facts = new ArrayList<>();

        mapFacts = new LinkedHashMap<>();

        //mapFacts.put("France is the world's most popular tourist destination – some 83.7 million visitors arrived in France, according to the World Tourism Organization report published in 2014, making it the world's most-visited country.",R.drawable.frances1);
        mapFacts.put("France is the largest country in the EU, and known as 'the hexagon' – with an area of 551,000 sq km it's almost a fifth of the EU’s total area, and due to its six-sided shape France is sometimes referred to as l’hexagone. About a quarter is covered by forest; only Sweden and Finland have more.",R.drawable.frances2 );
        mapFacts.put("Louis XIX was the king of France for just 20 minutes, the shortest ever reign – he ascended to the French throne in July 1830 after his father Charles X abdicated, and abdicated himself 20 minutes later in favour of his nephew, the Duke of Bordeaux.",R.drawable.frances3);
        mapFacts.put("Liberté, égalitié, fraternité meaning ‘liberty, equality and fraternity’ (or brotherhood) is the national motto of France – it first appeared around the time of the Revolution (1789–1799), and was written into the constitutions of 1946 and 1958. Today you’ll see it on coins, postage stamps and government logos often alongside ‘Marianne’ who symbolises the ‘triumph of the Republic’.",R.drawable.frances4);
        mapFacts.put("The French Army was the first to use camouflage in 1915 (World War I) – the word camouflage came from the French verb ‘to make up for the stage’. Guns and vehicles were painted by artists called camofleurs.",R.drawable.frances5);
        mapFacts.put("In France you can marry a dead person – under French law, in exceptional cases you can marry posthumously, as long as you can also prove that the deceased had the intention of marrying while alive and you receive permission from the French president.",R.drawable.frances6);
        mapFacts.put("France was the first country in the world to ban supermarkets from throwing away or destroying unsold food – since February 2016, shops must donate wastage to food banks or charities.",R.drawable.frances7);
        mapFacts.put("The Académie Française has aimed to preserve the French language since 1634 – by attempting to ban, somewhat unsuccessfully, foreign words such as blog, hashtag, parking, email and weekend. It was started by a small group of French intellects and officially recognised by Louis XIII in 1635.",R.drawable.frances8);
        mapFacts.put("At least 40 percent of the music on private radio stations must be of French origin – since 1996, the country’s top media regulator the Conseil Supérieur de L’Audiovisuel (CSA) has been charged with enforcing this French law. The CSA also requires half of the French music quota to be less than six months old.",R.drawable.frances9);
        mapFacts.put("France legalised same-sex marriage in 2013 – when President Françoise Holland signed the bill into law on 18 May 2013, France became the ninth country in Europe and 14th in the world to legalise same-sex marriage.",R.drawable.frances10);
        mapFacts.put("Europe’s highest mountain is in the French Alps – Mont Blanc, at 4,810m, takes an arduous 10 to 12 hours to climb to the summit. Alternatively, you can take a leisurely 20-minute trip up on Europe’s highest cable car on the nearby Aiguille du Midi to get a brilliant view of Mont Blanc.",R.drawable.frances11);
        mapFacts.put("The Louvre Museum in Paris was the most visited museum in the world in 2014 – with an amazing 9.3 million visitors, it received almost the same amount of people as the population of Sweden.",R.drawable.frances12);
        mapFacts.put("The world’s first artificial heart transplant and face transplant both took place in France – the heart transplant occurred in December 2013 at the Georges Pompidou Hospital in Paris. The bioprosthetic device, which mimics a real heart’s contractions, is powered by external lithium-ion battery, and is about three times the weight of a real organ.", R.drawable.frances13);
        mapFacts.put("Totalling around 29,000km, the French rail network is the second largest in Europe (after Germany) and the ninth biggest in the world – France was one of the world's first countries to utilise high-speed technology, introducing the TGV high-speed rail in 1981. The Tours-Bordeaux high-speed project, due for completion in 2017, will add a further 302km to the existing 1,550km.",R.drawable.frances14 );
        mapFacts.put("Paris Gare du Nord is Europe's busiest railway station – and by far, with some 190 million passengers passing through each year. Inaugurated in 1846, it it also one of the world's oldest stations.", R.drawable.frances15);
        mapFacts.put("French wines can reach astronomical prices – in 2014, Sotheby’s sold a 114-bottle lot of DCR Romanee-Conti wines in Hong Kong for more than EUR 1.45m to an anonymous Asia-based buyer, a world record for a single wine lot. That works out to about EUR 1,619 per standard glass. ", R.drawable.frances16);
        mapFacts.put("The French invented the metric system, the decimalised way of counting and weighing, in 1793 – the original prototype kilo, Le Grand K, is a cylinder made in the 1880s out of platinum and iridium and about the size of a plum, and was the only object known to scientists to have a mass of exactly 1kg. ", R.drawable.frances17);
        mapFacts.put("French gastronomy was awarded UNESCO World Heritage Status in 2010 – when it was added to the list of ‘intangible cultural heritage of humanity’. Experts described the importance of French gastronomy as ‘a social custom aimed at celebrating the most important moments in the lives of individuals and groups'.", R.drawable.frances18);
        mapFacts.put("France has produced some of the world’s most influential writers and thinkers – Descartes and Pascal in the 17th century, Voltaire in the 18th, Baudelaire and Flaubert in the 19th and Sartre and Camus in the 20th. To date, France has won more Noble Prizes for Literature (15) than any other country.\n", R.drawable.frances19);
        mapFacts.put("France produces nearly a billion tons of cheese a year in around 1,200 different varieties – in France it's an ancient art: goats cheese dates back to at least 500AD, the blue-veined Roquefort was mentioned in records of an ancient monastery in Conques as early as 1070, and hard farm cheeses like Emmental started to appear in the 13th century.", R.drawable.frances20);
        mapFacts.put("You might get a ‘fish’ stuck on your back on April Fool’s Day – if you’re in France on 1 April, don’t be surprised if children try to stick paper fish to your back and call you a ‘Poisson d’Avril’ (April Fish). This tradition is supposed to have started in the 16th century when King Charles XIV of France changed the calendar and those who continued to celebrate the end of the New Year at the end of March were ridiculed as fools.", R.drawable.frances21);
        mapFacts.put("The French eat around 30,000 tonnes of snails a year – but only about 1,000 tonnes of the classic French delicacy (served with garlic, parsley and butter) come from France; only some 100 registered snail farms existed in France in 2015.", R.drawable.frances22);
        mapFacts.put("Marcel Proust’s A la recherche du temps perdu holds the record as the world’s longest novel – his 13-volume masterpiece, translated as Remembrance of things past, is more than 3,000 pages long and has a cast of thousands and hundreds of interwoven plots strands. The first volume was published in 1913.", R.drawable.frances23);
        mapFacts.put("The world’s greatest cycle race, the Tour de France, has been around for more than 100 years – with the first event held on 1 July 1903. Every July, cyclists race some 3,200km (2,000 miles) primarily around France in a series of stages over 23 days, with the fastest cyclist at each stage wearing the famous yellow jersey.", R.drawable.frances24);
        mapFacts.put("The oldest recorded human voice is French – a 10-second fragment of the song Au Clair de la Lune was recorded by French inventor Edouard-Leon Scott de Martinville on paper on 9 April 1860. He used a ‘phonautograph’, which allowed sounds to be recorded visually. ",R.drawable.frances25);


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
                int id = mapFacts.get (keys[i]);
                textFacts.setText(text);
                textFacts.setTextColor(color);
                Glide.with(getApplicationContext()).load(id).into(imageFacts);
            }


        });
    }

}
