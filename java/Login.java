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
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {

    EditText emailid,password;
    Button sigin;
    TextView signup;
    FirebaseAuth mFirebaseAuth;
    FirebaseAuth.AuthStateListener mAuthStateListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mFirebaseAuth =FirebaseAuth.getInstance();
        final EditText emailid=(EditText) findViewById(R.id.textview4);
        final EditText password=(EditText)findViewById(R.id.textview3);
        final TextView signup=(TextView)findViewById(R.id.textview);
        Button sigin=(Button)findViewById(R.id.button);

        mAuthStateListener =new FirebaseAuth.AuthStateListener() {

            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser=mFirebaseAuth.getCurrentUser();
                if(mFirebaseUser !=null)
                {
                    Toast.makeText(Login.this,"logged in",Toast.LENGTH_LONG).show();
                    Intent kiruba=new Intent(Login.this,home.class);
                    startActivity(kiruba);
                }

        }
    };
        sigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email=emailid.getText().toString();
                String pass=password.getText().toString();
                if(email.isEmpty())
                {
                    emailid.setError("enter the email");
                    emailid.requestFocus();
                }
                else if(pass.isEmpty())
                {
                    password.setError("enter the password");
                    password.requestFocus();
                }
                else if(!(email.isEmpty()&&pass.isEmpty()))
                {
                    mFirebaseAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                Toast.makeText(Login.this,"enter correct email or password",Toast.LENGTH_LONG).show();
                            }
                            else {
                                Intent kvk=new Intent(Login.this,start.class);
                                startActivity(kvk);
                            }
                        }
                    });
                }
                else
                {
                    Toast.makeText(Login.this,"error",Toast.LENGTH_LONG).show();
                }
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Login.this,MainActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);
    }
    }


