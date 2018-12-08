package com.example.user.payakorn;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1;
    MediaPlayer mp;
    MediaPlayer mpBgm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this, R.raw.sound_effect);
        mpBgm = MediaPlayer.create(MainActivity.this, R.raw.puzzle);

        mpBgm.setLooping(true);
        mpBgm.start();

        button1 = (Button) findViewById(R.id.btnmain);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(go);
                mp.start();
            }
        });


        getSupportActionBar().hide(); //
    }

}
