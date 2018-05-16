package com.example.jatin.foreignlanguagefinal.French;

import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.jatin.foreignlanguagefinal.R;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrenchMainNumbers extends AppCompatActivity implements RecyclerAdapterFrenchNumbers.ListItemClickListenerNumbers {

    String[] numbers = {"Uh", "Deux", "Trois", "Quatre", "Cinq", "Six", "Sept", "Huit", "Neuf", "Dix", "Onze", "Douze", "Treize", "Quatorz", "Quinze","Seize","Dix-sept","Dix-huit","Dix-Neuf","Vingt"};
    String[] numbersEnglish = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
    int[] numberImages = {R.drawable.french1,
            R.drawable.french2,
            R.drawable.french3,
            R.drawable.french4,
            R.drawable.french5,
            R.drawable.french6,
            R.drawable.french7,
            R.drawable.french8,
            R.drawable.french9,
            R.drawable.french10,
            R.drawable.french11,
            R.drawable.french12,
            R.drawable.french13,
            R.drawable.french14,
            R.drawable.french15,
            R.drawable.french16,
            R.drawable.french17,
            R.drawable.french18,
            R.drawable.french19,
            R.drawable.french20};

    RecyclerView recylerNumbers;
    SoundPool soundPool;
    HashMap<Integer, Integer> loadedSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_main_numbers);

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
        loadedSound.put(0,soundPool.load(this, R.raw.french1,1));
        loadedSound.put(1,soundPool.load(this, R.raw.french2,1));
        loadedSound.put(2,soundPool.load(this, R.raw.french3,1));
        loadedSound.put(3,soundPool.load(this, R.raw.french4,1));
        loadedSound.put(4,soundPool.load(this, R.raw.french5,1));
        loadedSound.put(5,soundPool.load(this, R.raw.french6,1));
        loadedSound.put(6,soundPool.load(this, R.raw.french7,1));
        loadedSound.put(7,soundPool.load(this, R.raw.french8,1));
        loadedSound.put(8,soundPool.load(this, R.raw.french9,1));
        loadedSound.put(9,soundPool.load(this, R.raw.french10,1));
        loadedSound.put(10,soundPool.load(this, R.raw.french11,1));
        loadedSound.put(11,soundPool.load(this, R.raw.french12,1));
        loadedSound.put(12,soundPool.load(this, R.raw.french13,1));
        loadedSound.put(13,soundPool.load(this, R.raw.french14,1));
        loadedSound.put(14,soundPool.load(this, R.raw.french15,1));
        loadedSound.put(15,soundPool.load(this, R.raw.french16,1));
        loadedSound.put(16,soundPool.load(this, R.raw.french17,1));
        loadedSound.put(17,soundPool.load(this, R.raw.french18,1));
        loadedSound.put(18,soundPool.load(this, R.raw.french19,1));
        loadedSound.put(19,soundPool.load(this, R.raw.french20,1));


        recylerNumbers = findViewById(R.id.recyclerMainNumbers);

        RecyclerAdapterFrenchNumbers recyclerAdapterFrenchNumbers = new RecyclerAdapterFrenchNumbers(numbers,numbersEnglish,numberImages,this,getApplicationContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recylerNumbers.setAdapter(recyclerAdapterFrenchNumbers);
        recylerNumbers.setLayoutManager(linearLayoutManager);

    }

    @Override
    public void onListItemClick(View view, int position) throws IOException {

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
            case 10:
                soundPool.play(loadedSound.get(10), 1, 1, 0, 0, 1f);
                break;
            case 11:
                soundPool.play(loadedSound.get(11), 1, 1, 1, 0, 1f);
                break;
            case 12:
                soundPool.play(loadedSound.get(12), 1, 1, 1, 0, 1f);
                break;
            case 13:
                soundPool.play(loadedSound.get(13), 1, 1, 1, 0, 1f);
                break;
            case 14:
                soundPool.play(loadedSound.get(14), 1, 1, 1, 0, 1f);
                break;
            case 15:
                soundPool.play(loadedSound.get(15), 1, 1, 1, 0, 1f);
                break;
            case 16:
                soundPool.play(loadedSound.get(16), 1, 1, 1, 0, 1f);
                break;
            case 17:
                soundPool.play(loadedSound.get(17), 1, 1, 1, 0, 1f);
                break;
            case 18:
                soundPool.play(loadedSound.get(18), 1, 1, 1, 0, 1f);
                break;
            case 19:
                soundPool.play(loadedSound.get(19), 1, 1, 1, 0, 1f);
                break;
            default:
                break;




        }
    }
}
