package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        final Button contact1,contact2;
        contact1 =findViewById(R.id.contact1);
        contact1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber1 = "000000000";
                Intent makeCallIntent = new Intent(Intent.ACTION_DIAL);
                makeCallIntent.setData(Uri.parse("tel:" + phoneNumber1));
                startActivity(makeCallIntent);
            }
        });
        contact2 =findViewById(R.id.contact2);
        contact2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "0000000000";
                Intent makeCallIntent = new Intent(Intent.ACTION_DIAL);
                makeCallIntent.setData(Uri.parse("tel:" + phoneNumber));
                startActivity(makeCallIntent);
            }
        });


    }
}
