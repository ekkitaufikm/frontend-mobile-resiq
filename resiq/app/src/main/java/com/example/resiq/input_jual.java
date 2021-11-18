package com.example.resiq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class input_jual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_jual);
    }
    public void clickDashboard(View view){
        Intent i = new Intent(input_jual.this, MainActivity.class);
        startActivity(i);
    }
}