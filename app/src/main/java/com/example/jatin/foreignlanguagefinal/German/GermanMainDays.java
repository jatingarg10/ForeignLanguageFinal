package com.example.jatin.foreignlanguagefinal.German;

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

public class GermanMainDays extends AppCompatActivity implements RecyclerAdapterGermanDays.ListItemClickListener {

    String[] germanDays = {"Montag","Dienstag","Mitteoch","Donnerstag","Freitag","Samstag","Sonntag"};
    String[] germanDaysTrans = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    int[] germanDaysImage = {R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder};

    RecyclerView recyclerView;
    SoundPool soundPool;
    HashMap<Integer, Integer> loadedSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_german_main_days);

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
        loadedSound.put(0,soundPool.load(this, R.raw.germanmonday,1));
        loadedSound.put(1,soundPool.load(this, R.raw.germantuesday,1));
        loadedSound.put(2,soundPool.load(this, R.raw.germanwednesday,1));
        loadedSound.put(3,soundPool.load(this, R.raw.germanthursday,1));
        loadedSound.put(4,soundPool.load(this, R.raw.germanfriday,1));
        loadedSound.put(5,soundPool.load(this, R.raw.germansaturday,1));
        loadedSound.put(6,soundPool.load(this, R.raw.germansunday,1));

        recyclerView = findViewById(R.id.recyclerGermanDays);
        RecyclerAdapterGermanDays ragd = new RecyclerAdapterGermanDays(germanDays,germanDaysTrans,germanDaysImage,this,getApplicationContext());
        LinearLayoutManager llm = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(ragd);
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
        }

    }
}
