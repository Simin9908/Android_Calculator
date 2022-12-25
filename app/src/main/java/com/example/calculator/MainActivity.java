package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    TextView resultTV, solveTV;
    MaterialButton butC, butopen, butclose, butdiv, but7, but8, but9, butmul, but4, but5, but6, butadd, but1, but2, but3, butsub, butac, but0, butdot, buteq;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTV=findViewById(R.id.result_tv);
        solveTV=findViewById(R.id.solution_tv);

        assignID(but0,R.id.button_0);
        assignID(but1,R.id.button_1);
        assignID(but2,R.id.button_2);
        assignID(but3,R.id.button_3);
        assignID(but4,R.id.button_4);
        assignID(but5,R.id.button_5);
        assignID(but6,R.id.button_6);
        assignID(but7,R.id.button_7);
        assignID(but8,R.id.button_8);
        assignID(but9,R.id.button_9);
        assignID(butC,R.id.button_C);
        assignID(butopen,R.id.button_open_bracket);
        assignID(butclose,R.id.button_close_bracket);
        assignID(butdiv,R.id.button_divide);
        assignID(butmul,R.id.button_multiply);
        assignID(butadd,R.id.button_add);
        assignID(butsub,R.id.button_sub);
        assignID(buteq,R.id.button_eq);
        assignID(butdot,R.id.button_point);
        assignID(butac,R.id.button_ac);

    }

    void assignID(MaterialButton btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        MaterialButton button = (MaterialButton) view; //creates a function for material buttons to do something
        String buttonText = button.getText().toString(); //makes it a text

        //solveTV.setText(buttonText); //replaces the display text with what I'm seeing

        String calc_this = solveTV.getText().toString(); //cannot put static value in string so need to have some default value at the start; purpose is declaring varaible for concatenation


        if (buttonText.equals("=")){
            //get result from function
            Expression e = new ExpressionBuilder(calc_this).build();
            double result = e.evaluate();
            String val = Double.toString(result);
            resultTV.setText(val);
        }


        //As long as button text is not equal to C, AC, do the following:
        calc_this=calc_this+buttonText;
        solveTV.setText(calc_this);



        /*if (buttonText.equals("AC")){
            solveTV.setText("");
            resultTV.setText("O");
            return;
        }

        if (buttonText.equals("=")){
            solveTV.setText(resultTV.getText());
            return;
        }*/

    }
}