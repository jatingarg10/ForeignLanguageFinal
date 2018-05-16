package com.example.jatin.foreignlanguagefinal.French;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.jatin.foreignlanguagefinal.R;

import java.util.HashMap;

public class FrenchMainMonths extends AppCompatActivity implements RecyclerAdapterFrenchMonth.ListItemClickListener {

    String[] frenchMonth = {"Janvier","Fevrier","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Decembre"};
    String[] frenchMonthTrans = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    int[] frenchMonthImage = {R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,};

    RecyclerView recyclerView;
    SoundPool soundPool;
    HashMap<Integer, Integer> loadedSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_main_months);

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
        loadedSound.put(0,soundPool.load(this, R.raw.frenchjan,1));
        loadedSound.put(1,soundPool.load(this, R.raw.frenchfeb,1));
        loadedSound.put(2,soundPool.load(this, R.raw.frenchmarch,1));
        loadedSound.put(3,soundPool.load(this, R.raw.frenchapril,1));
        loadedSound.put(4,soundPool.load(this, R.raw.frenchmay,1));
        loadedSound.put(5,soundPool.load(this, R.raw.frenchjune,1));
        loadedSound.put(6,soundPool.load(this, R.raw.frenchjuly,1));
        loadedSound.put(7,soundPool.load(this, R.raw.frenchaug,1));
        loadedSound.put(8,soundPool.load(this, R.raw.frenchsept,1));
        loadedSound.put(9,soundPool.load(this, R.raw.frenchoct,1));
        loadedSound.put(10,soundPool.load(this, R.raw.frenchnov,1));
        loadedSound.put(11,soundPool.load(this, R.raw.frenchdec,1));


        recyclerView = findViewById(R.id.recyclerFrenchMonths);
        RecyclerAdapterFrenchMonth rafm = new RecyclerAdapterFrenchMonth(frenchMonth,frenchMonthTrans,frenchMonthImage,this,getApplicationContext());
        LinearLayoutManager llm = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(rafm);
    }

    @Override
    public void onClickListener(View view, int position) {
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
            case 9:
                soundPool.play(loadedSound.get(9), 1, 1, 0, 0, 1f);
                break;
            case 10:
                soundPool.play(loadedSound.get(10), 1, 1, 0, 0, 1f);
                break;
            case 11:
                soundPool.play(loadedSound.get(11), 1, 1, 1, 0, 1f);
                break;
        }

    }
}
