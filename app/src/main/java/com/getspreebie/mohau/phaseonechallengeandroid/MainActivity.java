package com.getspreebie.mohau.phaseonechallengeandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aboutButton = (Button) findViewById(R.id.button_about);
        Button myProfileButton = (Button) findViewById(R.id.button_profile);

        // Create an OnClickListener 'About Button' and navigate to the 'About ALC Activity' page
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AboutALCActivity.class));
            }
        });

        // Create an OnClickListener 'My Profile Button' and navigate to the 'My Profile Activity' page
        myProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MyProfileActivity.class));
            }
        });

    }
}
