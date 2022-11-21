package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    public static final int CODIGO_VUELTA_LIMPIAR = 0;
    public static final int CODIGO_VUELTA_TEXTO = 1;
    public static final String MSG = "com.example.intents.MSG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}