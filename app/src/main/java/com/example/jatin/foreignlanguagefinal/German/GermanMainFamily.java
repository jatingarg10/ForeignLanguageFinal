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

public class GermanMainFamily extends AppCompatActivity implements RecyclerAdapterGermanFamily.ListItemClickListener {

    String[] germanFamily = {"Vater","Mutter","GroB Mutter","GroB Vater","Sohn","Tochter","Alterer Bruder","Alterer Schwester","Jungere Schwester","Jungere bruder",};
    String[] germanFamilEnglish={"Father","Mother","Grand Mother","Grand Father","Son","Daughter","Older Brother","Older Sister","Younger Sister","Younger Brother"};
    int[] germanFamilyImages ={R.drawable.family_father,
            R.drawable.family_mother,
            R.drawable.family_grandmother,
            R.drawable.family_grandfather,
            R.drawable.family_son,
            R.drawable.family_daughter,
            R.drawable.family_older_brother,
            R.drawable.family_older_sister,
            R.drawable.family_younger_sister,
            R.drawable.family_younger_brother,};

    RecyclerView recyclerView;
    SoundPool soundPool;
    HashMap<Integer, Integer> loadedSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_german_main_family);

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
        loadedSound.put(0,soundPool.load(this, R.raw.germanfather,1));
        loadedSound.put(1,soundPool.load(this, R.raw.germanmother,1));
        loadedSound.put(2,soundPool.load(this, R.raw.germangrandmother,1));
        loadedSound.put(3,soundPool.load(this, R.raw.germangrandfather,1));
        loadedSound.put(4,soundPool.load(this, R.raw.germanson,1));
        loadedSound.put(5,soundPool.load(this, R.raw.fermandaughter,1));
        loadedSound.put(6,soundPool.load(this, R.raw.germanolderbrother,1));
        loadedSound.put(7,soundPool.load(this, R.raw.germanoldersister,1));
        loadedSound.put(8,soundPool.load(this, R.raw.germanyoungersister,1));
        loadedSound.put(9,soundPool.load(this, R.raw.germanyoungerbrother,1));

        recyclerView = findViewById(R.id.recyclerGermanFamily);
        RecyclerAdapterGermanFamily ragf = new RecyclerAdapterGermanFamily(germanFamily,germanFamilEnglish,germanFamilyImages,this,getApplicationContext());
        LinearLayoutManager llm = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(ragf);
    }

    @Override
    public void onClick(View view, int position) {
        switch (position) {
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
            default:
                break;

        }

    }
}
