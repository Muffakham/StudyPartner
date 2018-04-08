package com.example.farhan.studypartner;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;

public class signup extends AppCompatActivity {

    private static final String TAG = "your activity name";
    EditText e ,f;
    Button b;
    String email,password ;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        auth = FirebaseAuth.getInstance();
        e = (EditText)findViewById(R.id.email);
        email = e.getText().toString();
        f = (EditText)findViewById(R.id.pass);
        Log.d(TAG,"Email = "+email);
        password  = f.getText().toString();
        b  = (Button)findViewById(R.id.button4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"Email = "+email);



        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(signup.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    //Log.d(TAG, "createUserWithEmail:success");
                }
                  else
                {
                    //Log.w(TAG, "createUserWithEmail:failure", task.getException());
                    FirebaseAuthException e  = (FirebaseAuthException)task.getException();
                    Log.e("signup", "Failed Registration", e);
                    Toast.makeText(signup.this, "Authentication failed.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
            }
        });


    }
}
