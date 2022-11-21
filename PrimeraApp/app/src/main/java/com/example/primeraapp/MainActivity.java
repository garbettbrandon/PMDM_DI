package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaramos
    TextView lSalida;
    Button BotonHola;
    int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Pinta el UI (Instanciación)

        //Los referencio
        lSalida = findViewById(R.id.lSalida);
        BotonHola = findViewById(R.id.BotonHola);

        /*BotonHola.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        cont ++;
                        lSalida.setText(String.valueOf(cont));
                    }
                }
        );*/

        ElQueManeja manejador = new ElQueManeja(lSalida);
        BotonHola.setOnClickListener(manejador);
    }

    public void pulsado(View v){
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}