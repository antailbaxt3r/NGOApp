package com.antailbaxt3r.ngoapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.antailbaxt3r.ngoapp.R;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();
        if(auth.getCurrentUser() == null){
            Intent login = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(login);
        }else{
            Intent start = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(start);
        }
    }
}
