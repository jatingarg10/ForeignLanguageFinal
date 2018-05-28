package com.example.jatin.foreignlanguagefinal.NavigationDrawer;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.jatin.foreignlanguagefinal.R;


import org.w3c.dom.Element;

import java.util.Calendar;

public class AboutUs extends AppCompatActivity {

    Button send;
    TextInputEditText userFeedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        /*Element adsElement = new Element();
        adsElement.setTitle("Advertise Here!");

        View aboutPage = new AboutUs(this())
                .isRTL(false)
                .setImage(R.drawable.artabout)
                .setDescription("An Amity way of Learning!")
                .addItem(new Element().setTitle("Version 2.0"))
                .addItem(adsElement)
                .addGroup("Connect With Us")
                .addEmail("koundik5@gmail.com")
                .addWebsite("http://google.co.in")
                .addFacebook("Jatin Garg")
                .addTwitter("My Twitter")
                .addPlayStore("My PlayStore")
                .addInstagram("My Instagram")
                .addItem(createCopyright())
                .create();

        setContentView(aboutPage);*/

        /*send = (Button) findViewById(R.id.submit);
        userFeedback = (TextInputEditText) findViewById(R.id.userFeedback);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();

                sendIntent.putExtra(Intent.EXTRA_EMAIL  , new String[] { "foreignlanguage2014@gmail.com" });


                //sendIntent.putExtra(Intent.ACTION_SENDTO, "foreignlanguage2014@gmail.com");
                sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback For Foreign Language");
                sendIntent.putExtra(Intent.EXTRA_TEXT, userFeedback.getText());

                sendIntent.setType("text/plain");

                startActivity(sendIntent);

            }
        });*/
    }
    /*private Element createCopyright() {
        final Element copyright = new Element();
        final String copyrightString = String.format("Copyright %d by Kaundinya & Jatin", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        copyright.setIcon(R.mipmap.ic_launcher);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AboutUs.this,copyrightString,Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;*/
    }

