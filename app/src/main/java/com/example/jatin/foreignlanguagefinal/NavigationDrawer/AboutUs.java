package com.example.jatin.foreignlanguagefinal.NavigationDrawer;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jatin.foreignlanguagefinal.R;

import org.w3c.dom.Text;

public class AboutUs extends AppCompatActivity {

    Button send;
    TextInputEditText userFeedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        send = (Button) findViewById(R.id.submit);
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
        });
    }
}
