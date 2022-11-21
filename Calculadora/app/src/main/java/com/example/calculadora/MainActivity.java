package com.example.calculadora;

import static java.lang.Float.parseFloat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView resultTv;
    Button buttonAC;
    Button buttonDivide,buttonMultiply,buttonPlus,buttonMinus,buttonEquals;
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    Button buttonDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTv = findViewById(R.id.tvResultado);

        assignId(buttonAC,R.id.btAC);
        assignId(buttonDivide,R.id.btDivision);
        assignId(buttonMultiply,R.id.btx);
        assignId(buttonPlus,R.id.btSuma);
        assignId(buttonMinus,R.id.btResta);
        assignId(buttonEquals,R.id.btIgual);
        assignId(button0,R.id.bt0);
        assignId(button1,R.id.bt1);
        assignId(button2,R.id.bt2);
        assignId(button3,R.id.bt3);
        assignId(button4,R.id.bt4);
        assignId(button5,R.id.bt5);
        assignId(button6,R.id.bt6);
        assignId(button7,R.id.bt7);
        assignId(button8,R.id.bt8);
        assignId(button9,R.id.bt9);
        assignId(buttonDot,R.id.btComa);

    }

    void assignId(Button btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button button =(Button) view;
        String buttonText = button.getText().toString();
        String dataToCalculate = resultTv.getText().toString();

        if(buttonText.equals("AC")){
            resultTv.setText("0");
            return;
        }
        if(buttonText.equals("=")){
            resultTv.setText(resultTv.getText());
            return;
        }
        dataToCalculate = dataToCalculate+buttonText;
        resultTv.setText(dataToCalculate);

        String finalResult = getResult(dataToCalculate);

        if(!finalResult.equals("Err")){
            resultTv.setText(finalResult);
        }
    }

    String getResult(String data){
        try{
            Context context  = Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initStandardObjects();
            String finalResult =  context.evaluateString(scriptable,data,"Javascript",1,null).toString();
            if(finalResult.endsWith(".0")){
                finalResult = finalResult.replace(".0","");
            }
            return finalResult;
        }catch (Exception e){
            return "Err";
        }
    }
}