package com.example.resiq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class popupBerhasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_berhasil);
    }
    public void clickJual(View view){
        Intent i = new Intent(popupBerhasil.this, input_jual.class);
        startActivity(i);
    }
    public void clickBerhasil(View view){
        Intent i = new Intent(popupBerhasil.this, MainActivity.class);
        startActivity(i);
    }
}