package com.example.user.payakorn;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class CardActivity extends AppCompatActivity {
    private AlertDialog.Builder dlgAlert;
    private MediaPlayer mp;

    ImageView imageView;
    Button button;
    Random r;
    Integer[] Images = {R.drawable.card14, R.drawable.card16, R.drawable.card25, R.drawable.card26,
            R.drawable.card27, R.drawable.card31, R.drawable.card32, R.drawable.card33,
            R.drawable.card35, R.drawable.card38, R.drawable.card39, R.drawable.card40,
            R.drawable.card42, R.drawable.card43, R.drawable.card44, R.drawable.card46};
    TextView textView;
    int numtext;
    private String[] textinfo;
    int i=0;

   // String[] info = {"home","register","card"};
    int pickedImage = 0, lastPicked = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        textinfo = getResources().getStringArray(R.array.cardinfo_list);
        mp = MediaPlayer.create(this, R.raw.sound_effect_02);
        imageView = (ImageView) findViewById(R.id.imageView4);

        button = (Button) findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView2);

        r = new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                do {
                    pickedImage = r.nextInt(Images.length);
                }
                while (pickedImage == lastPicked);

                lastPicked = pickedImage;
                imageView.setImageResource(Images[pickedImage]);
                numtext = pickedImage;
                textView.setText(textinfo[numtext]);
                i++;
                mp.start();

                if(i>3) {
                    button.setEnabled(false);
                    imageView.setImageResource(R.drawable.backcard);
                    textView.setText(null);
                    dlgAlert = new AlertDialog.Builder(CardActivity.this);
                    dlgAlert.setTitle("แจ้งเตือน");
                    dlgAlert.setMessage("คุณสามารถกดทำนายสูงสุดได้แค่ 3 ครั้งต่อการใช้งาน ระบบจะพาคุณกลับสู่หน้าหลัก");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(false);
                    dlgAlert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                            Toast.makeText(CardActivity.this, "ไว้ทำนายกันใหม่คราวหน้านะ", Toast.LENGTH_SHORT).show();
                        }
                    });
                    dlgAlert.create().show();
                    button.setEnabled(false);
                    mp.stop();

                }
            }
        });
        getSupportActionBar().hide();
    }
}
