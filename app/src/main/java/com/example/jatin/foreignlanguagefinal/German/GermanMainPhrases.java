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

public class GermanMainPhrases extends AppCompatActivity implements RecyclerAdapterGermanPhrases.ListItemClickListener {

    String[] phrases={"Hallo!","Guten Morgan!","WIs geht es dir", "Mir geht es gut, danke","Gute Nacht","Kann ich dir helfen?", "Mein name ist","Herr/Faur","QWie alt sind sie?"};
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
        setContentView(R.layout.activity_german_main_phrases);

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
        loadedSound.put(0,soundPool.load(this, R.raw.germanhi,1));
        loadedSound.put(1,soundPool.load(this, R.raw.germangoodmorning,1));
        loadedSound.put(2,soundPool.load(this, R.raw.germanhowareyou,1));
        loadedSound.put(3,soundPool.load(this, R.raw.germaniamfinethankyou,1));
        loadedSound.put(4,soundPool.load(this, R.raw.germangoodnight,1));
        loadedSound.put(5,soundPool.load(this, R.raw.germancanihelpyou,1));
        loadedSound.put(6,soundPool.load(this, R.raw.germanmynameis,1));
        loadedSound.put(7,soundPool.load(this, R.raw.germanmrmrs,1));
        loadedSound.put(8,soundPool.load(this, R.raw.germanhowoldareyou,1));

        recyclerView = findViewById(R.id.recyclerGermanPhrases);
        RecyclerAdapterGermanPhrases ragp = new RecyclerAdapterGermanPhrases(phrases,phrasesTrans,phrasesImages,this,getApplicationContext());
        LinearLayoutManager llm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);

        recyclerView.setAdapter(ragp);
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
