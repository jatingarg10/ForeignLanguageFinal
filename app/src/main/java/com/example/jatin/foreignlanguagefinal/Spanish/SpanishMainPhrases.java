package com.example.jatin.foreignlanguagefinal.Spanish;

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

public class SpanishMainPhrases extends AppCompatActivity implements RecyclerMainPhrases.ListItemClickListener {

    String[] phrases={"Hola!","Buenos Dias!","Como estas?", "Estoy bien, gracias","Buenas Noches","Te puedo ayudar?", "Como te llamas?","Mi Nombre Es..","Senor/Seorita","Cuantos anos tienes?"};
    String[] phrasesTrans = {"Hi!","Good Morning","How are you?","I am fine, Thank You","Good Night","Can I help you?","What's Your Name?","My Name Is..","Mr/Mrs","How old are you?"};
    int[] phrasesImages = {R.drawable.frenchplaceholder,
            R.drawable.frenchplaceholder,
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
        setContentView(R.layout.activity_spanish_main_phrases);

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
        loadedSound.put(0,soundPool.load(this, R.raw.spanishhi,1));
        loadedSound.put(1,soundPool.load(this, R.raw.spanishgoodmorning,1));
        loadedSound.put(2,soundPool.load(this, R.raw.spanishhowareyou,1));
        loadedSound.put(3,soundPool.load(this, R.raw.spanishiamfinethankyou,1));
        loadedSound.put(4,soundPool.load(this, R.raw.spanishgoodnight,1));
        loadedSound.put(5,soundPool.load(this, R.raw.spanishcanihelpyou,1));
        loadedSound.put(6,soundPool.load(this, R.raw.spanishwhatsyourname,1));
        loadedSound.put(7,soundPool.load(this, R.raw.spanishmynameis,1));
        loadedSound.put(8,soundPool.load(this, R.raw.spanishmrmrs,1));
        loadedSound.put(9,soundPool.load(this, R.raw.spanishhowoldareyou,1));

        recyclerView = findViewById(R.id.recyclerSpanishPhrases);
        RecyclerMainPhrases rmp = new RecyclerMainPhrases(phrases,phrasesTrans,phrasesImages,this,getApplicationContext());
        LinearLayoutManager llm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);

        recyclerView.setAdapter(rmp);
        recyclerView.setLayoutManager(llm);
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
        }

    }
}
