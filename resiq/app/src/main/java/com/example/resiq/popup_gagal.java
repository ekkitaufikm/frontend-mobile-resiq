package com.example.resiq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class popup_gagal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_gagal);
    }
    public void clickJual(View view){
        Intent i = new Intent(popup_gagal.this, input_jual.class);
        startActivity(i);
    }
}