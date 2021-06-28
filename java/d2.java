package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class d2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d2);

        TextView t1=(TextView)findViewById(R.id.IFS8);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent karu=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.upsc.gov.in/examinations/Indian%20Forest%20Service%20%28Preliminary%29%20Examination%2C%202019%20through%20CS%28P%29%20Examination%202019\n"));
                startActivity(karu);
            }
        });
    }
}
