package com.example.contadorconreset;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3;
    TextView tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);

        TextView.OnEditorActionListener manejador = new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_GO){
                    tv4.setText(
                            String.format(
                                    "Hola %s\nTus datos:\n%s\n%s",
                                    et1.getText(),
                                    et2.getText(),
                                    et3.getText()
                            )
                    );
                    return true;
                }
                return false;
            }
        };
        et1.setOnEditorActionListener(manejador);
        et2.setOnEditorActionListener(manejador);
        et3.setOnEditorActionListener(manejador);
    }
}