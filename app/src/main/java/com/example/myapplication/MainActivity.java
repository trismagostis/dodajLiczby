package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addBtn=(Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText=(EditText)  findViewById(R.id.firsNumEditText);
                EditText secondNumEditText=(EditText)  findViewById(R.id.secondNumEditText);
                TextView resultTextView=(TextView) findViewById(R.id.resultTextView);
                int Num1=Integer.parseInt(firstNumEditText.getText().toString());
                int Num2=Integer.parseInt(secondNumEditText.getText().toString());
                int result=Num1+Num2;
//                String resultString = Integer.toString(result);
                resultTextView.setText(result+"");


            }
        });
    }
}