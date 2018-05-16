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

public class FrenchMainPhrases extends AppCompatActivity implements RecyclerAdapterFrenchPhrases.ListItemClickListener {

    String[] phrases={"Salut!","Bonjour!","Comment allez-vous?", "Je vais bien, merci!","Bonne nuit!","Puis-je vous aider?", "Je m'appelle","Monsieur/Madame","Quel age avez-vous?"};
    String[] phrasesTrans = {"Hi!","Good Morning","How are you?","I am fine, Thank You","Good Night","Can I help you?","My name is..","Mr/Mrs","How old are you?"};
    int[] phrasesImages = {R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,
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
        setContentView(R.layout.activity_french_main_phrases);

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
        loadedSound.put(0,soundPool.load(this, R.raw.frenchhi,1));
        loadedSound.put(1,soundPool.load(this, R.raw.frenchgoodmorning,1));
        loadedSound.put(2,soundPool.load(this, R.raw.frenchhowareyou,1));
        loadedSound.put(3,soundPool.load(this, R.raw.frenchiamfine,1));
        loadedSound.put(4,soundPool.load(this, R.raw.frenchgoodnight,1));
        loadedSound.put(5,soundPool.load(this, R.raw.frenchcanihelpyou,1));
        loadedSound.put(6,soundPool.load(this, R.raw.frenchmynameis,1));
        loadedSound.put(7,soundPool.load(this, R.raw.frenchmrmrs,1));
        loadedSound.put(8,soundPool.load(this, R.raw.frenchhowoldareyou,1));

        recyclerView = findViewById(R.id.recyclerFrenchPhrases);
        RecyclerAdapterFrenchPhrases rafp = new RecyclerAdapterFrenchPhrases(phrases,phrasesTrans,phrasesImages,this,getApplicationContext());
        LinearLayoutManager llm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);

        recyclerView.setAdapter(rafp);
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
