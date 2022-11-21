package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2;
    Button bt1;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Los referencio
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        bt1 = findViewById(R.id.bt1);
        et1 = findViewById(R.id.et1);

        bt1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        tv2.setText("EL nombre es "+et1.getText());
                    }
                }
        );
    }
}