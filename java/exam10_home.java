package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class  exam10_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam10_home);



        final Button a1;
        a1 = (Button)findViewById(R.id.a1);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 =new Intent(getApplicationContext(),asset.class);
                startActivity(in1);
            }
        });

        final Button a2;
        a2 = (Button)findViewById(R.id.a2);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 =new Intent(getApplicationContext(),cpyls.class);
                startActivity(in2);
            }
        });
        final Button a3;
        a3 = (Button)findViewById(R.id.a3);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3=new Intent(getApplicationContext(),fae.class);
                startActivity(in3);
            }
        });
        final Button a4;
        a4 = (Button)findViewById(R.id.a4);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4=new Intent(getApplicationContext(),fyjc.class);
                startActivity(in4);
            }
        });

        final Button a5;
        a5 = (Button)findViewById(R.id.a5);
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5=new Intent(getApplicationContext(), geo.class);
                startActivity(in5);
            }
        });

        final Button a6;
        a6 = (Button)findViewById(R.id.a6);
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in6=new Intent(getApplicationContext(),iais.class);
                startActivity(in6);
            }
        });

        final Button a7;
        a7 = (Button)findViewById(R.id.a7);
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in7=new Intent(getApplicationContext(),iar.class);
                startActivity(in7);
            }
        });

        final Button a8;
        a8 = (Button)findViewById(R.id.a8);
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in8=new Intent(getApplicationContext(),iasr.class);
                startActivity(in8);
            }
        });
        final Button a9;
        a9 = (Button)findViewById(R.id.a9);
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in9=new Intent(getApplicationContext(),ieo.class);
                startActivity(in9);
            }
        });
        final Button a10;
        a10 = (Button)findViewById(R.id.a10);
        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in10=new Intent(getApplicationContext(),ieso.class);
                startActivity(in10);
            }
        });
        final Button a11;
        a11 = (Button)findViewById(R.id.a11);
        a11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in11=new Intent(getApplicationContext(),inmr.class);
                startActivity(in11);
            }
        });

        final Button a12;
        a12 = (Button)findViewById(R.id.a12);
        a12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in12=new Intent(getApplicationContext(),ino.class);
                startActivity(in12);
            }
        });

        final Button a13;
        a13 = (Button)findViewById(R.id.a13);
        a13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in13=new Intent(getApplicationContext(),iom.class);
                startActivity(in13);
            }
        });
        final Button a14;
        a14 = (Button)findViewById(R.id.a14);
        a14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in14=new Intent(getApplicationContext(),ios.class);
                startActivity(in14);
            }
        });
        final Button a15;
        a15 = (Button)findViewById(R.id.a15);
        a15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in15=new Intent(getApplicationContext(),ko.class);
                startActivity(in15);
            }
        });

        final Button a16;
        a16 = (Button)findViewById(R.id.a16);
        a16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in16 =new Intent(getApplicationContext(),kvpy.class);
                startActivity(in16);
            }
        });

        final Button a17;
        a17 = (Button)findViewById(R.id.a17);
        a17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in17 =new Intent(getApplicationContext(),nbo.class);
                startActivity(in17);
            }
        });
        final Button a18;
        a18 = (Button)findViewById(R.id.a18);
        a18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in18=new Intent(getApplicationContext(),nco.class);
                startActivity(in18);
            }
        });
        final Button a19;
        a19 = (Button)findViewById(R.id.a19);
        a19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in19=new Intent(getApplicationContext(),neet.class);
                startActivity(in19);
            }
        });

        final Button a20;
        a20 = (Button)findViewById(R.id.a20);
        a20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in20=new Intent(getApplicationContext(), nimo.class);
                startActivity(in20);
            }
        });

        final Button a21;
        a21= (Button)findViewById(R.id.a21);
        a21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in21=new Intent(getApplicationContext(),NLSTSE.class);
                startActivity(in21);
            }
        });

        final Button a22;
        a22 = (Button)findViewById(R.id.a22);
        a22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in22=new Intent(getApplicationContext(),nso.class);
                startActivity(in22);
            }
        });

        final Button a23;
        a23 = (Button)findViewById(R.id.a23);
        a23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in23=new Intent(getApplicationContext(),NTSA.class);
                startActivity(in23);
            }
        });
        final Button a24;
        a24 = (Button)findViewById(R.id.a24);
        a24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in24=new Intent(getApplicationContext(),NTSE.class);
                startActivity(in24);
            }
        });
        final Button a25;
        a25 = (Button)findViewById(R.id.a25);
        a25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in25=new Intent(getApplicationContext(),silverzone.class);
                startActivity(in25);
            }
        });
        final Button a26;
        a26 = (Button)findViewById(R.id.a26);
        a26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in26=new Intent(getApplicationContext(),skgko.class);
                startActivity(in26);
            }
        });

        final Button a27;
        a27 = (Button)findViewById(R.id.a27);
        a27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in27=new Intent(getApplicationContext(),SOF.class);
                startActivity(in27);
            }
        });

        final Button a28;
        a28 = (Button)findViewById(R.id.a28);
        a28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in28=new Intent(getApplicationContext(),Techno.class);
                startActivity(in28);
            }
        });
        final Button a29;
        a29 = (Button)findViewById(R.id.a29);
        a29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in29=new Intent(getApplicationContext(),uco.class);
                startActivity(in29);
            }
        });
        final Button a30;
        a30 = (Button)findViewById(R.id.a30);
        a30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in30=new Intent(getApplicationContext(),zio.class);
                startActivity(in30);
            }
        });

    }
}
