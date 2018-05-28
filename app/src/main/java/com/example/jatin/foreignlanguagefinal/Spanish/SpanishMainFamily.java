package com.example.jatin.foreignlanguagefinal.Spanish;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.jatin.foreignlanguagefinal.French.RecyclerAdapterFrenchFamily;
import com.example.jatin.foreignlanguagefinal.R;

import java.util.HashMap;

public class SpanishMainFamily extends AppCompatActivity implements RecyclerMainFamily.ListItemClickListener {

    String[] frenchFamily = {"Padre", "Madre", "Abuela", "Abuelo", "Hijo", "Hija", "Hermano Mayor", "Hermana Mayor", "Hermana Menor", "Hermano Menor",};
    String[] frenchFamilEnglish = {"Father", "Mother", "Grand Mother", "Grand Father", "Son", "Daughter", "Older Brother", "Older Sister", "Younger Sister", "Younger Brother"};
    int[] frenchFamilyImages = {R.drawable.family_father,
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
        setContentView(R.layout.activity_spanish_main_family);

        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .build();

        soundPool = new SoundPool.Builder()
                .setMaxStreams(5)
                .setAudioAttributes(audioAttributes)
                .build();
        setVolumeControlStream(AudioManager.STREAM_MUSIC);

        loadedSound = new HashMap<Integer, Integer>();
        loadedSound.put(0, soundPool.load(this, R.raw.spanishfather, 1));
        loadedSound.put(1, soundPool.load(this, R.raw.spanishmother, 1));
        loadedSound.put(2, soundPool.load(this, R.raw.spanishgrandmother, 1));
        loadedSound.put(3, soundPool.load(this, R.raw.spanishgrandfather, 1));
        loadedSound.put(4, soundPool.load(this, R.raw.spanishson, 1));
        loadedSound.put(5, soundPool.load(this, R.raw.spanishdaughter, 1));
        loadedSound.put(6, soundPool.load(this, R.raw.spanisholderbrother, 1));
        loadedSound.put(7, soundPool.load(this, R.raw.spanisholdersister, 1));
        loadedSound.put(8, soundPool.load(this, R.raw.spanishyoungersister, 1));
        loadedSound.put(9, soundPool.load(this, R.raw.spanishyoungerbrother, 1));

        recyclerView = findViewById(R.id.recyclerSpanishFamily);
        RecyclerMainFamily rmf = new RecyclerMainFamily(frenchFamily, frenchFamilEnglish, frenchFamilyImages, this, getApplicationContext());
        LinearLayoutManager llm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(rmf);
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
