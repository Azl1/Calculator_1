package com.abdullaev.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonMultiply;
    Button buttonDivision;
    Button buttonReset;
    Button buttonEquals;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view();
    }

    public void view() {
       textView = findViewById(R.id.text);
       button0 = findViewById(R.id.zero);
       button1 = findViewById(R.id.one);
       button2 = findViewById(R.id.two);
       button3 = findViewById(R.id.three);
       button4 = findViewById(R.id.four);
       button5 = findViewById(R.id.five);
       button6 = findViewById(R.id.six);
       button7 = findViewById(R.id.seven);
       button8 = findViewById(R.id.eight);
       button9 = findViewById(R.id.nine);
       buttonPlus = findViewById(R.id.plus);
       buttonMinus = findViewById(R.id.minus);
       buttonMultiply = findViewById(R.id.multiply);
       buttonDivision = findViewById(R.id.division);
       buttonReset = findViewById(R.id.reset);
       buttonEquals  = findViewById(R.id.equals);
    }
}