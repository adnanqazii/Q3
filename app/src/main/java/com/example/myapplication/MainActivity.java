package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

    }
    public void toLogin(View view) {
        Intent myIntent = new Intent(MainActivity.this, Login.class);
        MainActivity.this.startActivity(myIntent);
    }

}