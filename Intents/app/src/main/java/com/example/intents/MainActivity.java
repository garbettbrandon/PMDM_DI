package com.example.intents;

import static android.content.ContentValues.TAG;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String MESSAGE_NOMBRE = "";
    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityResultLauncher<Intent> activityResult = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        Log.d(TAG, ""+result.getResultCode());
                        int code = result.getResultCode();
                        switch (code){
                            case RESULT_CANCELED:
                                Log.d(TAG,"Vuelve Cancelado");
                                break;
                            case MainActivity2.CODIGO_VUELTA_LIMPIAR:
                                Log.d(TAG,"Limpiar Texto");
                                nombre.setText("");

                            case MainActivity2.CODIGO_VUELTA_TEXTO:
                                Log.d(TAG,"Vuelve con código, buscar intent");
                                Intent intent = result.getData();
                                String mensaje = intent.getStringExtra(MainActivity2.MSG);
                                nombre.setText(mensaje);
                        }
                    }
                }
        );
    }
    public void enviarNombre (){
        Intent intent = new Intent(this, MainActivity2.class);
        String message = nombre.getText().toString();
        intent.putExtra(MESSAGE_NOMBRE, message);
        activityResult.launch(intent);
    }
    public void enviarMensajeVuelta(){
        Intent intent = new Intent();
        intent.putExtra(MSG, texto_ant.getText().toString());
        setResult(CODIGO_VUELTA_TEXTO, intent);
        MainActivity2.super.onBackPressed();
    }
    public void inicioVuelta(){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(MSG_CODE, "Hola, voy de vuelta y limpio texto");
        MainActivity2.super.onBackPressed();
    }
    //BOTON DE ATRAS
    public void atras(){
        MainActivity2.super.onBackPressed();
    }
}