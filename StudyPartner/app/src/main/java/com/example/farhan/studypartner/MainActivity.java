package com.example.farhan.studypartner;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    Button button,b1;
    String email,password;
    private FirebaseAuth mAuth;
    TextView d;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        mAuth = FirebaseAuth.getInstance();
        EditText e = (EditText)findViewById(R.id.editText4);
        EditText p = (EditText)findViewById(R.id.editText3);
        d = (TextView) findViewById(R.id.disp);
        email = (String)e.getText().toString();
        password = (String)p.getText().toString();
        Log.d("hello","Email = "+email);
        //System.out.println(email);       //Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Log.d("hello","Email = "+email);
                d.setText(email);

            }
        });

        b1 = (Button)findViewById(R.id.b3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            
            

            static final int  = 86;
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,signup.class);
                startActivity(i);
            }
        });

    }


}
