package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class d22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d22);

        TextView t1=(TextView)findViewById(R.id.non8);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent karu=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.indiaeducation.net/civil_services/defence/air-force/iaf-airman-exam/non-tech-exam/\n"));
                startActivity(karu);
            }
        });
    }
}