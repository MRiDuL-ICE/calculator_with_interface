package com.example.calculator_with_interface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etn1;
    private Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17;
    double Res1,Res2;
    boolean add,sub,div,mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        bt10 = findViewById(R.id.bt10);
        bt11 = findViewById(R.id.bt11);
        bt12 = findViewById(R.id.bt12);
        bt13 = findViewById(R.id.bt13);
        bt14 = findViewById(R.id.bt14);
        bt15 = findViewById(R.id.bt15);
        bt16 = findViewById(R.id.bt16);
        bt17 = findViewById(R.id.bt17);
        etn1 = findViewById(R.id.etn1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etn1.setText(etn1.getText()+"1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etn1.setText(etn1.getText()+"2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etn1.setText(etn1.getText()+"3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etn1==null){
                    etn1.setText("");
                }
                else{
                    Res1=Double.parseDouble(etn1.getText()+"");
                    add=true;
                    etn1.setText(null);
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etn1.setText(etn1.getText()+"4");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etn1.setText(etn1.getText()+"5");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etn1.setText(etn1.getText()+"6");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etn1==null){
                    etn1.setText("");
                }
                else{
                    Res1=Double.parseDouble(etn1.getText()+"");
                    sub=true;
                    etn1.setText(null);
                }
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etn1.setText(etn1.getText()+"7");
            }
        });
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etn1.setText(etn1.getText()+"8");
            }
        });
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etn1.setText(etn1.getText()+"9");
            }
        });
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etn1==null){
                    etn1.setText("");
                }
                else{
                    Res1=Double.parseDouble(etn1.getText()+"");
                    mul=true;
                    etn1.setText(null);
                }
            }
        });
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etn1.setText(etn1.getText()+".");

            }
        });
        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etn1.setText(etn1.getText()+"0");
            }
        });
        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etn1==null){
                    etn1.setText("");
                }
                else{
                    Res1=Double.parseDouble(etn1.getText()+"");
                    div=true;
                    etn1.setText(null);
                }
            }
        });
        bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        etn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public void onClick(View view) {

    }
}