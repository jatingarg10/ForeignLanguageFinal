package com.example.jatin.foreignlanguagefinal.Spanish;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.jatin.foreignlanguagefinal.R;

import java.util.HashMap;

public class SpanishMainColors extends AppCompatActivity implements RecyclerMainColors.ListItemClickListener
{

    String[] colors = {"Rojo","Negro","Blanco","Verde","Amarillo","Marron","Gris","Azul","Naranja"};
    String[] colorTrans =  {"Red","Black","White","Green","Yellow","Brown","Gray","Blue","Orange"};
    int[] colorImages = {R.drawable.color_red,
            R.drawable.color_black,
            R.drawable.color_white,
            R.drawable.color_green,
            R.drawable.color_mustard_yellow,
            R.drawable.color_brown,
            R.drawable.color_gray,
            R.drawable.color_blue,
            R.drawable.color_orange,};

    RecyclerView recyclerView;
    SoundPool soundPool;
    HashMap<Integer, Integer> loadedSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanish_main_colors);

        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .build();

        soundPool = new SoundPool.Builder()
                .setMaxStreams(5)
                .setAudioAttributes(audioAttributes)
                .build();
        setVolumeControlStream(AudioManager.STREAM_MUSIC);

        loadedSound = new HashMap<Integer,Integer>();
        loadedSound.put(0,soundPool.load(this, R.raw.spanishred,1));
        loadedSound.put(1,soundPool.load(this, R.raw.spanishblack,1));
        loadedSound.put(2,soundPool.load(this, R.raw.spanishwhite,1));
        loadedSound.put(3,soundPool.load(this, R.raw.spanishgreen,1));
        loadedSound.put(4,soundPool.load(this, R.raw.spanishyellow,1));
        loadedSound.put(5,soundPool.load(this, R.raw.spanishbrown,1));
        loadedSound.put(6,soundPool.load(this, R.raw.spanishgray,1));
        loadedSound.put(7,soundPool.load(this, R.raw.spanishblue,1));
        loadedSound.put(8,soundPool.load(this, R.raw.spanishorange,1));

        recyclerView = findViewById(R.id.recyclerSpanishColors);
        RecyclerMainColors rmc = new RecyclerMainColors(colors,colorTrans,colorImages,this,getApplicationContext());
        LinearLayoutManager llm = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerView.setAdapter(rmc);
        recyclerView.setLayoutManager(llm);
    }

    @Override
    public void onClick(View view, int position) {

        switch (position)
        {
            case 0:
                soundPool.play(loadedSound.get(0), 1, 1, 1, 0, 1f);
                break;
            case 1:
                soundPool.play(loadedSound.get(1), 1, 1, 0, 0, 1f);
                break;
            case 2:
                soundPool.play(loadedSound.get(2), 1, 1, 0, 0, 1f);
                break;
            case 3:
                soundPool.play(loadedSound.get(3), 1, 1, 0, 0, 1f);
                break;
            case 4:
                soundPool.play(loadedSound.get(4), 1, 1, 0, 0, 1f);
                break;
            case 5:
                soundPool.play(loadedSound.get(5), 1, 1, 0, 0, 1f);
                break;
            case 6:
                soundPool.play(loadedSound.get(6), 1, 1, 0, 0, 1f);
                break;
            case 7:
                soundPool.play(loadedSound.get(7), 1, 1, 0, 0, 1f);
                break;
            case 8:
                soundPool.play(loadedSound.get(8), 1, 1, 0, 0, 1f);
                break;
        }

    }
}
