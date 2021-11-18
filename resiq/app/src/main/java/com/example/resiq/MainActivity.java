package com.example.resiq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickDaftar(View view){
        Intent i = new Intent(MainActivity.this, register.class);
        startActivity(i);
    }
    public void clickLogin(View view){
        Intent i = new Intent(MainActivity.this, login.class);
        startActivity(i);
    }
}