package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class medical_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_list);
        Button m1=(Button)findViewById(R.id.medi001);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me1=new Intent(getApplicationContext(),med1.class);
                startActivity(me1);
            }
        });
        Button m2=(Button)findViewById(R.id.medi002);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me2=new Intent(getApplicationContext(),med2.class);
                startActivity(me2);
            }
        });
        Button m3=(Button)findViewById(R.id.medi003);
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me3=new Intent(getApplicationContext(),med3.class);
                startActivity(me3);
            }
        });
        Button m4=(Button)findViewById(R.id.medi004);
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me4=new Intent(getApplicationContext(),med4.class);
                startActivity(me4);
            }
        });
        Button m5=(Button)findViewById(R.id.medi005);
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me5=new Intent(getApplicationContext(),med5.class);
                startActivity(me5);
            }
        });
        Button m6=(Button)findViewById(R.id.medi006);
        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me6=new Intent(getApplicationContext(),med6.class);
                startActivity(me6);
            }
        });
        Button m7=(Button)findViewById(R.id.medi007);
        m7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me7=new Intent(getApplicationContext(),med7.class);
                startActivity(me7);
            }
        });
        Button m8=(Button)findViewById(R.id.medi008);
        m8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me8=new Intent(getApplicationContext(),med8.class);
                startActivity(me8);
            }
        });
        Button m9=(Button)findViewById(R.id.medi009);
        m9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me9=new Intent(getApplicationContext(),med9.class);
                startActivity(me9);
            }
        });
        Button m10=(Button)findViewById(R.id.medi010);
        m10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me10=new Intent(getApplicationContext(),med10.class);
                startActivity(me10);
            }
        });
        Button m11=(Button)findViewById(R.id.medi011);
        m11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me11=new Intent(getApplicationContext(),med11.class);
                startActivity(me11);
            }
        });
        Button m12=(Button)findViewById(R.id.medi012);
        m12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me12=new Intent(getApplicationContext(),med12.class);
                startActivity(me12);
            }
        });
        Button m13=(Button)findViewById(R.id.medi013);
        m13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me13=new Intent(getApplicationContext(),med13.class);
                startActivity(me13);
            }
        });
        Button m14=(Button)findViewById(R.id.medi014);
        m14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me14=new Intent(getApplicationContext(),med14.class);
                startActivity(me14);
            }
        });
        Button m15=(Button)findViewById(R.id.medi015);
        m15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me15=new Intent(getApplicationContext(),med15.class);
                startActivity(me15);
            }
        });
        Button m16=(Button)findViewById(R.id.medi016);
        m16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me16=new Intent(getApplicationContext(),med16.class);
                startActivity(me16);
            }
        });
        Button m17=(Button)findViewById(R.id.medi017);
        m17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me17=new Intent(getApplicationContext(),med17.class);
                startActivity(me17);
            }
        });
        Button m18=(Button)findViewById(R.id.medi018);
        m18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me18=new Intent(getApplicationContext(),med18.class);
                startActivity(me18);
            }
        });
        Button m19=(Button)findViewById(R.id.medi019);
        m19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me19=new Intent(getApplicationContext(),med19.class);
                startActivity(me19);
            }
        });
        Button m20=(Button)findViewById(R.id.medi020);
        m20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me20=new Intent(getApplicationContext(),med20.class);
                startActivity(me20);
            }
        });
        TextView tm1 = (TextView) findViewById(R.id.refermed);
        tm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://targetstudy.com/courses/medical/"));
                startActivity(in1);

            }
        });

    }
}
