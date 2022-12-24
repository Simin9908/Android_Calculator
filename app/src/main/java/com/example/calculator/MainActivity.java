package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {


    TextView resultTV, solutionTV;
    MaterialButton butC, butopen, butclose, butdiv, but7, but8, but9, butmul, but4, but5, but6, butadd, but1, but2, but3, butsub, butac, but0, butdot, buteq;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}