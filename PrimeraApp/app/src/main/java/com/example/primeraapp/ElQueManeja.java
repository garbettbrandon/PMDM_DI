package com.example.primeraapp;

import android.view.View;
import android.widget.TextView;

public class ElQueManeja implements View.OnClickListener {
    int cont;
    TextView salida;
    public ElQueManeja(TextView s){
        cont = 0;
        salida = s;
    }

    @Override
    public void onClick(View view) {
        cont ++;
        salida.setText(String.valueOf(cont));
    }
}
