package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;



public class asset extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asset);

        TextView t1=(TextView)findViewById(R.id.asset8);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent karu=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ei-india.com/index.php/register-online-for-asset"));
                startActivity(karu);
            }
        });

    }
}

