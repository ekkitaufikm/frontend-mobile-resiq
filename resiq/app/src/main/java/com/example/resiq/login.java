package com.example.resiq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void clickDaftar(View view){
        Intent i = new Intent(login.this, register.class);
        startActivity(i);
    }
    public void clickJual(View view){
        Intent i = new Intent(login.this, input_jual.class);
        startActivity(i);
    }
}