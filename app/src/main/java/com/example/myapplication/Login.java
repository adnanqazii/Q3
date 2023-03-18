package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent intent = getIntent();


    }
    public void toSignup(View view) {
        Intent myIntent = new Intent(Login.this, SignupActivity.class);
        Login.this.startActivity(myIntent);
    }
}