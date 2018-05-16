package com.example.jatin.foreignlanguagefinal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.jatin.foreignlanguagefinal.AppIntro.AppInto1;
import com.example.jatin.foreignlanguagefinal.NavigationDrawer.LanguageChooser;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.auth.FirebaseAuth;

public class GoogleLogin extends AppCompatActivity {

   Button skip;
    private static final int REQUEST_ACCESS_FINE_LOCATION = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_login);

        Button skip = (Button) findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(this,NavigationDrawer.class));
                Intent Intent = new Intent(view.getContext(), LanguageChooser.class);
                view.getContext().startActivity(Intent);
                finish();
            }
        });

        boolean hasPermissionLocation = (ContextCompat.checkSelfPermission(getApplicationContext(),
                android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED);
        if (!hasPermissionLocation) {
            ActivityCompat.requestPermissions(GoogleLogin.this,
                    new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    REQUEST_ACCESS_FINE_LOCATION);
        }


    }
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode)
        {

            case REQUEST_ACCESS_FINE_LOCATION:
            {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                {
                    Toast.makeText(GoogleLogin.this, "Permission granted.", Toast.LENGTH_SHORT).show();

                    //reload my activity with permission granted
                    finish();
                    startActivity(getIntent());

                } else
                {
                    Toast.makeText(GoogleLogin.this, "The app was not allowed to get your location. Hence, it cannot function properly. Please consider granting it this permission", Toast.LENGTH_LONG).show();
                }
            }

        }

    }



}
