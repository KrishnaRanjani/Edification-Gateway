package com.example.sampleapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText emailid,password,name,fathername,dateofbirth,gender,age,phonenumber;
    Button sigin;
    TextView signin;
    FirebaseAuth mFirebaseAuth;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mFirebaseAuth = FirebaseAuth.getInstance();
        final EditText name = (EditText)findViewById(R.id.text5);
        final EditText fathername = (EditText)findViewById(R.id.text6);
        final EditText dateofbirth = (EditText)findViewById(R.id.text7);
        final EditText gender = (EditText)findViewById(R.id.text8);
        final EditText age = (EditText)findViewById(R.id.text9);
        final EditText phonenumber =(EditText)findViewById(R.id.text10);
        final EditText emailid = (EditText)findViewById(R.id.text3);
        final EditText password = (EditText)findViewById(R.id.text4);
        final TextView signin = (TextView) findViewById(R.id.textview2);
        final Button sigin = (Button) findViewById(R.id.button3);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("user");

        sigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailid.getText().toString();
                String pass = password.getText().toString();
                final String na = name.getText().toString();
                final String fa = fathername.getText().toString();
                final String da = dateofbirth.getText().toString();
                final String ge = gender.getText().toString();
                final String ag = gender.getText().toString();
                final String phone = gender.getText().toString();
                if (na.isEmpty()) {
                    name.setError("enter your name");
                    name.requestFocus();
                } else if (fa.isEmpty()) {
                    fathername.setError("enter father namne");
                    fathername.requestFocus();
                } else if (da.isEmpty()) {
                    dateofbirth.setError("enter date of bitrh");
                    dateofbirth.requestFocus();
                } else if (ge.isEmpty()) {
                    gender.setError("enter gender");
                    gender.requestFocus();
                } else if (ag.isEmpty()) {
                    age.setError("enter age");
                    age.requestFocus();
                } else if (phone.isEmpty()) {
                    phonenumber.setError("enter phone number");
                    phonenumber.requestFocus();
                } else  if (email.isEmpty()) {
                    emailid.setError("enter email");
                    emailid.requestFocus();
                } else if (pass.isEmpty()) {
                    password.setError("enter password");
                    password.requestFocus();
                } else if (!(email.isEmpty() && pass.isEmpty())) {
                    mFirebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()) {
                                Toast.makeText(MainActivity.this, "Signup error", Toast.LENGTH_LONG).show();

                            } else {
                                Save save = new Save(na, fa, da, ge, ag, phone);
                                databaseReference.push().setValue(save);
                                Intent intent = new Intent(MainActivity.this, Login.class);
                                Toast.makeText(getApplicationContext(), "Account create sucessfully", Toast.LENGTH_LONG).show();
                                startActivity(intent);

                            }
                        }
                    });
                } else {
                    Toast.makeText(MainActivity.this, "error", Toast.LENGTH_LONG).show();
                }
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(MainActivity.this, Login.class);
                startActivity(inten);
            }
        });
    }
}
