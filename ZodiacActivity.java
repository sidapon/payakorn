package com.example.user.payakorn;

/**
 * Created by USER on 4/25/2018.
 */
import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class ZodiacActivity extends Activity {

    private ImageView image;
    private String[] choice;
    private Spinner spinner;
    private TypedArray imgs;
    private TextView textd;
    private String[] textexplain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac);

        choice = getResources().getStringArray(R.array.zodiac_list);
        imgs = getResources().obtainTypedArray(R.array.zodiac_image_list);
        textexplain = getResources().getStringArray(R.array.zodiacexplain_list);


        image = (ImageView) findViewById(R.id.zodiac_image);
        spinner = (Spinner) findViewById(R.id.zodiac_spinner);
        textd = (TextView) findViewById(R.id.textView);


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, choice);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                image.setImageResource(imgs.getResourceId(
                        spinner.getSelectedItemPosition(), -1));
                textd.setText(textexplain[position].toString());

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
    }
}