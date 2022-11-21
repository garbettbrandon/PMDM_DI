package com.example.practica_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView contP, cont1, cont2, cont3, cont4;
    Button reset_all, reset1, reset2, reset3, reset4, btn1, btn2, btn3, btn4;

    int contaP, conta1, conta2, conta3, conta4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contP = findViewById(R.id.cont1);
        cont1 = findViewById(R.id.cont2);
        cont2 = findViewById(R.id.cont3);
        cont3 = findViewById(R.id.cont4);
        cont4 = findViewById(R.id.cont5);
        reset_all = findViewById(R.id.reset_all);
        reset1 = findViewById(R.id.reset1);
        reset2 = findViewById(R.id.reset2);
        reset3 = findViewById(R.id.reset3);
        reset4 = findViewById(R.id.reset4);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        reset_all.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        contP.setText(String.valueOf(contaP=0));
                        cont1.setText(String.valueOf(conta1=0));
                        cont2.setText(String.valueOf(conta2=0));
                        cont3.setText(String.valueOf(conta3=0));
                        cont4.setText(String.valueOf(conta4=0));
                    }
                }
        );

        btn1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        contaP++;
                        conta1++;
                        contP.setText(String.valueOf(contaP));
                        cont1.setText(String.valueOf(conta1));
                    }
                }
        );

        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        contaP++;
                        conta2++;
                        contP.setText(String.valueOf(contaP));
                        cont2.setText(String.valueOf(conta2));
                    }
                }
        );

        btn3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        contaP++;
                        conta3++;
                        contP.setText(String.valueOf(contaP));
                        cont3.setText(String.valueOf(conta3));
                    }
                }
        );

        btn4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        contaP++;
                        conta4++;
                        contP.setText(String.valueOf(contaP));
                        cont4.setText(String.valueOf(conta4));
                    }
                }
        );

        reset1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        contaP = contaP - conta1;
                        cont1.setText(String.valueOf(conta1=0));
                        contP.setText(String.valueOf(contaP));
                    }
                }
        );

        reset2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        contaP = contaP - conta2;
                        cont2.setText(String.valueOf(conta2=0));
                        contP.setText(String.valueOf(contaP));
                    }
                }
        );

        reset3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        contaP = contaP - conta3;
                        cont3.setText(String.valueOf(conta3=0));
                        contP.setText(String.valueOf(contaP));
                    }
                }
        );

        reset4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        contaP = contaP - conta4;
                        cont4.setText(String.valueOf(conta4=0));
                        contP.setText(String.valueOf(contaP));
                    }
                }
        );
    }
}