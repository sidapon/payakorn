package com.example.user.payakorn;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


/**
 * Created by lalit on 10/10/2016.
 */

public class HomeActivity extends AppCompatActivity {

    private AppCompatTextView textViewName;
    private MediaPlayer mp;
    private Button button;
    private MediaPlayer mpBgm;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mp = MediaPlayer.create(this, R.raw.sound_effect_01);
        mpBgm = MediaPlayer.create(HomeActivity.this, R.raw.puzzle);
//        mpBgm.setLooping(true);
//        mpBgm.start();
        getSupportActionBar().setTitle("");
        initViews();
        initObjects();

        ImageView imageView;
        imageView = (ImageView) findViewById(R.id.imageView1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(HomeActivity.this,CardActivity.class);
                startActivity(go);
                mp.start();
                view.setEnabled(false);
            }
        });

        ImageView imageView2;
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(HomeActivity.this,DayActivity.class);
                startActivity(go);
                mp.start();
            }
        });

        ImageView imageView3;
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(HomeActivity.this,ZodiacActivity.class);
                startActivity(go);
                mp.start();
            }
        });

        button = (Button) findViewById(R.id.buttonlist);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(HomeActivity.this, UsersListActivity.class);
                startActivity(go);
                mp.start();
            }
        });


//        getSupportActionBar().setTitle("งมงายพยากรณ์");
        getSupportActionBar().hide();

//        TextView textView;
//        textView = (TextView) findViewById(R.id.textviewaboutus);
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent go = new Intent(HomeActivity.this,aboutusActivity.class);
//                startActivity(go);
//                view.setEnabled(false);
//            }
//        });
    }



    /**
     * This method is to initialize views
     */
    private void initViews() {
        textViewName = (AppCompatTextView) findViewById(R.id.textViewName);
    }

    /**
     * This method is to initialize objects to be used
     */
    private void initObjects() {
        String UsernameFromIntent = getIntent().getStringExtra("USERNAME");
        textViewName.setText(UsernameFromIntent);
    }

    /**
     * This method is to fetch all user records from SQLite
     */

}
