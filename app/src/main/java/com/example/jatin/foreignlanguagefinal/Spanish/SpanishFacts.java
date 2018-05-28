package com.example.jatin.foreignlanguagefinal.Spanish;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class SpanishFacts extends AppCompatActivity {

    ArrayList<String> facts;
    ImageView imageFacts;
    TextView textFacts;
    Button nextFact;
    Map<String,Integer> mapFacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanish_facts);

        imageFacts = (ImageView) findViewById(R.id.imageFact);
        textFacts = (TextView) findViewById(R.id.textFact);
        nextFact = (Button) findViewById(R.id.nextFact);

        //facts = new ArrayList<>();

        mapFacts = new HashMap<>();

        //mapFacts.put("The Kingdom of Spain, as it’s officially known, is the second largest country in the EU – with an area of 505,955 square kilometres, Spain covers about 85 percent of the Iberian Peninsula, which it shares with Portugal.",R.drawable.spain1 );
        mapFacts.put("Spanish is the second most widely spoken language in the world – with more than 406 million people worldwide speaking Spanish, it comes only after Chinese. Back home, while Castilian Spanish is the official language, in Catalonia, the Basque country and Galicia, the regional languages of Catalan, Basque and Galician all have official status.",R.drawable.spain2);
        mapFacts.put("Nudity is legal in Spain – some say all the better to enjoy the country’s mainly Mediterranean-temperate climate with its hot dry summers, mild, rainy winters and more than 3,000 hours of sunlight a year. Spain also had the youngest marrying age in Europe before it changed the legal age from 14 to 16 years in 2015.",R.drawable.spain3);
        mapFacts.put("Spain has the fourth highest life expectancy of all the OECD countries – with a life expectancy of 82 years, it comes after Switzerland, Italy and Japan, and ranks 15th in the world. Spanish women live longer than men: 85 compared to 79 years. ",R.drawable.spain4);
        mapFacts.put("The United Nations projects that Spain will be the world’s oldest country by 2050 – with 40 percent of the population aged over 60. ",R.drawable.spain5);
        mapFacts.put("Spain is a constitutional monarchy – former king Juan Carlos I came to the throne after the right-wing dictator General Franco died in 1975. Once one of Europe’s most beloved monarchs, Juan Carlos fell from favour in recent years and abdicated in favour of his son, King Felipe VI, in 2014. ",R.drawable.spain6);
        mapFacts.put("There is only one tax inspector for every 1,928 taxpayers – compared to one per 729 people in France. So while Spain’s economy ranked 13th in the world, with a GDP of 1,356 billion USD (EUR 989 billion) in the 2013 Centre for Economic Research (Cebr) World Economic League Table, the Spanish Inland Revenue says a quarter of the GDP comes from the ‘black’ economy. ",R.drawable.spain7);
        mapFacts.put("In 2015, Spain has the second highest unemployment rate in Europe  – and third highest among the OECD countries at 24.2 percent, only slightly behind Greece and South Africa, and high above the OECD average of 7.3 percent (2014). Youth unemployment is even worse: around half of 15 to 24 year-olds who could be working are unemployed. ",R.drawable.spain8);
        mapFacts.put("Only half of all adults aged 15–64 have the equivalent of a high school degree – the OECD average is almost three-quarters. Younger people are staying on at school longer than the previous generation though, as 65 percent of 25–34-year-olds gain the qualification.",R.drawable.spain9);
        mapFacts.put("The next time you use a stapler, thank the Spanish – the first known stapler was made in the 18th century in the Basque country for the French King Louis XV – and every single staple was engraved with the royal emblem. Spain has also given the world the mop and bucket (1956), the forerunner of the modern cigarette (17th century) and the astronaut’s space suit (1935).",R.drawable.spain10);
        mapFacts.put("Spain produces over half of the world’s olive oil – more than some 1.5 million tons, and almost all of it comes from the southern region of Andalusia. It’s also the third largest wine producer after France and Italy, making 3.3 million tonnes (metric tons) in 2013.",R.drawable.spain11);
        mapFacts.put("Spain was the first country in the world where wind power was the greatest source of electricity. Red Eléctrica de España (REE), operators of Spain’s electricity system, revealed that in 2013 wind turbines generated over just under 54,000 gigawatt hours of electricity – a fifth of the nation’s usage.", R.drawable.spain122);
        mapFacts.put("There's no tooth fairy in Spain – when Spanish children lose a tooth, they put it under their pillow and a small mouse called Ratoncito Pérez comes to collect it and leaves a small gift or money in its place.",R.drawable.spain13 );

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
