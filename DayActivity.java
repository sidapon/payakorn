package com.example.user.payakorn;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class DayActivity extends AppCompatActivity {
    private Button button;
    private AlertDialog.Builder dlgAlert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);


        button = (Button) findViewById(R.id.sunday);
        button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openDialogSun();
                    }
                });

        button = (Button) findViewById(R.id.monday);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogMon();
            }
        });

        button = (Button) findViewById(R.id.tuesday);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogTue();
            }
        });

        button = (Button) findViewById(R.id.wednesday);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogWed();
            }
        });

        button = (Button) findViewById(R.id.thursday);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogThu();
            }
        });

        button = (Button) findViewById(R.id.friday);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogFri();
            }
        });

        button = (Button) findViewById(R.id.saturday);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogSat();
            }
        });
        getSupportActionBar().hide();
    }

    public void openDialogSun(){
        dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setTitle("คนเกิดวันอาทิตย์");
        dlgAlert .setMessage("มีความเป็นผู้นำสูง ชอบช่วยเหลือคนอื่น ใจร้อนวู่วามไปบ้างนิดหน่อย แต่สติปัญญาดีนะ จะได้ดีเพราะปาก เป็นคนพูดจามัดใจคนเก่ง " +
                "ในเรื่องความรักมักรีบเร่งเร้ารุนแรงและหลากหลาย ถึงไหนถึงกันไม่หวั่นและไม่ค่อยจะแคร์ใคร ไม่ว่าชายหรือหญิงที่เกิดวันนี้มีดีและจะประสบความสำเร็จแบบเวิร์คสุดสุดเชียวแหละ " +
                "ขอเพียงเอาความสามารถที่มีอยู่ใช้ให้ถูกที่ถูกทางเถอะ");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();

        dlgAlert.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //dismiss the dialog
                    }
                });
    }

    public void openDialogMon(){
        dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setTitle("คนเกิดวันจันทร์");
        dlgAlert.setMessage("เป็นคนปากหวาน พูดเก่ง ช่างจ้อช่างเม้าท์ ช่างเอาอกเอาใจ เขาเรียกว่าคนปากดีแต่ขี้น้อยใจ งอนเก่ง แต่หายไว " +
                "ในเรื่องความรักทั้งหญิงและชาย ร้ายพอ ๆ กัน แว๊บมาแว๊บไปไม่ทิ้งเขาก็ถูกเขาทิ้งก็เพราะเป็นคนช่างเลือกเรื่องมากและมาก เรื่องขี้รำคาญ " +
                "ชอบคิดซับคิดซ้อนพอ ๆ กับรักซ้อนซ่อนรักนั่นแหละ ถ้านำพรสวรรค์ในเรื่องของการพูดไปใช้ในทางที่ดี รับรองจะไปโลดในหน้าที่การงานแต่ถ้าจะให้เหมาะน่าจะทำงานด้านการขายขายอะไร " +
                "ก็ได้รับรองรุ่งสุด ๆ ขออย่างเดียวอย่าเจ้าเล่ห์มากนักเป็นพอ");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();

        dlgAlert.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //dismiss the dialog
                    }
                });

    }

    public void openDialogTue(){
        dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setTitle("คนเกิดวันอังคาร");
        dlgAlert.setMessage("เป็นคนขยันยันแข็ง คล่องแคล้วว่องไว มีไฟฝันแรงกล้าทะเยอทะยานและดันทุรังสูง เรื่องรักค่อนข้างจะหลายใจ พูดง่ายๆก็เจ้าชู้ไง " +
                "มีคนเข้ามาพัวพันไม่ขาดระยะ แต่ไม่ยักอยู่ยาวนาน ก็ใครจะไปทนทานความเจ้าชู้ของคุณได้ ถ้าไม่ใช่คนเกิดวันพฤหัส แต่ต้องระวังคำพูดคำจา " +
                "ประชดประชันกันมากเกินไป เอาแต่ใจตัวเอง เกรงใจคนอื่นเขาบ้าง หญิงชายเกิดวันนี้น่าจะรับราชการหรือเป็นพนักงานรัฐวิสาหกิจอะไรประเภทนี้ " +
                "จะดีกว่าไปทำอย่างอื่น ถ้าลดเรื่องการเอาแต่ใจตัวเองลงได้บ้าง รับรองตำแหน่งการงานไม่น้อยหน้าใครหรอก\n");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();

        dlgAlert.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //dismiss the dialog
                    }
                });
    }

    public void openDialogWed(){
        dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setTitle("คนเกิดวันพุธ");
        dlgAlert.setMessage("มีความกระตือรือร้น และอดทนเหลือหลาย แต่ไม่ค่อยจะรอบคอบเป็นคนทำมาหากินเก่งพูดจาดี มีความรอบรู้ " +
                "ผู้ใหญ่รักใคร่เอ็นดูและคอยช่วยเหลืออนาคตจึงค่อนข้างสดใสไปได้ดีในหน้าที่การงาน แต่ชีวิตรักกลับไม่ค่อยดีนักก็มัวแต่ทำงานไงจึงไม่ค่อยมีโอกาสเลือกมากนัก " +
                "คนเกิดวันนี้จะได้เข้าพิธีวิวาห์ก็ปาเข้าไปวัยเลขสามขึ้นหน้าเป็นชายไม่เท่า ไหร่แต่เป็นหญิงแล้วไซร้โอกาสสัมผัสคานทองนิเวศน์สูง และต้องหมั่นดูแลสุขภาพให้ดีด้วย");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();

        dlgAlert.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //dismiss the dialog
                    }
                });
    }

    public void openDialogThu(){
        dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setTitle("คนเกิดวันพฤหัสบดี");
        dlgAlert.setMessage("เป็นคนที่ซื่อสัตย์ ขยัน อดทน มีไหวพริบปฏิภาณ ละเอียดรอบคอบ และมีความรับผิดชอบสูง ชอบสั่งคนโน้นสอนคนนี้ไปเป็นครูบาอาจารย์ " +
                "หรือเป็นทนาย แหละดี ในเรื่องความรักไม่อยากจะพูด จืดสนิท อนาคตจะเป็นคนใหญ่คนโต มีชื่อเสียง มีคนนับหน้าถือตาและมีความสุขในครอบครัวขอเพียงเลือกคู่ที่จะมาครองให้ดี " +
                "เท่านั้นเอง");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();

        dlgAlert.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //dismiss the dialog
                    }
                });
    }

    public void openDialogFri(){
        dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setTitle("คนเกิดวันศุกร์");
        dlgAlert.setMessage("เป็นคนชอบเพ้อฝัน ชอบจินตนาการ พูดจาไพเราะอ่อนหวาน นุ่มนวล ช่างเอาอกเอาใจให้ใครต่อใครลุ่มหลง รักศิลปะ " +
                "รักสวยร้กงามทั้งหญิงชายเรียกได้ว่าเป็นวันของคนเจ้าชู้ ดูดี มีเสน่ห์ดึงดูดความสนใจของเพื่อนต่างเพศได้มาก แต่คนเกิดวันนี้มีอารมณ์เป็นใหญ่จะคิดอะไรจะทำอะไรขึ้นอยู่กับอารมณ์ " +
                "ถ้าระงับอารมณ์เอาไว้ได้อะไร ๆ ก็จะดีไปหมดทั้งเรื่องรัก การเงินและการงาน งานที่เหมาะที่สุดก็เป็นพวกสถาปนิก ศิลปิน ครีเอทีฟ");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();

        dlgAlert.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //dismiss the dialog
                    }
                });
    }

    public void openDialogSat(){
        dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setTitle("คนเกิดวันเสาร์");
        dlgAlert.setMessage("เป็นคนมั่นใจตัวเองสูงมาก ยึดถือตัวเองเป็นใหญ่ เงียบ ขรึม เก็บตัว ไม่ชอบวุ่นวายกับใครเป็นคนชอบคิดมาก คิดเล็กคิดน้อย แต่ไม่ค่อยคิดถึงใจผู้อื่น " +
                "ดื้อเงียบและถือดี ดูเหมือนใจเย็น แต่โมโหร้าย แต่หัวดี ฉลาด ความสามารถเพียบ ถ้าเรื่องความรัก รักแล้วรักเลย ขี้หึงร้ายกาจ เดี๋ยวร้อนเดี๋ยวเย็น " +
                "เอาแน่เอานอนไม่ได้ ค่อนข้างน่าเบื่ออยู่บ้าง คนเกิดวันนี้ถ้าลดความหยิ่ง ความถือดีในศักดิ์ศรีลงบ้าง จะเป็นคนที่มีอนาคต");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();

        dlgAlert.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //dismiss the dialog
                    }
                });
    }



}