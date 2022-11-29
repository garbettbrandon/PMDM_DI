package com.example.logindi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText user, pass;
    String userName = "Brandon", passWord = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.loginButton);
        user = findViewById(R.id.etEmail);
        pass = findViewById(R.id.etPass);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u = String.valueOf(user.getText());
                String p = String.valueOf(pass.getText());

                if (userName.equals(u) && passWord.equals(p)){
                    mostrarMensaje();
                    lanzarActivity();
                }else{
                    mensajeError();
                }
            }
        });
    }

    private void lanzarActivity() {
        Intent lanzar = new Intent(this,MainActivity2.class);
        lanzar.putExtra("NOMBRE", "BIENVENIDO BRANDON");
        startActivity(lanzar);
    }

    private void mensajeError() {
        Toast.makeText(this,"Usuario o Contraseña Incorrectas",Toast.LENGTH_LONG).show();
    }
    private void mostrarMensaje() {
        Toast.makeText(this,"Bienvenido!!",Toast.LENGTH_LONG).show();
    }

}