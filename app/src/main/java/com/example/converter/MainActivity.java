package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private EditText amount;
    private Button btsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Converter");
        getSupportActionBar().hide();

        final RadioButton frombr =(RadioButton)findViewById(R.id.frombr);
        final RadioButton fromuy =(RadioButton)findViewById(R.id.fromuy);
        final RadioButton fromus =(RadioButton)findViewById(R.id.fromus);

        final RadioButton tobr =(RadioButton)findViewById(R.id.tobr);
        final RadioButton touy =(RadioButton)findViewById(R.id.touy);
        final RadioButton tous =(RadioButton)findViewById(R.id.tous);

        final TextView ver_check = (TextView)findViewById(R.id.txtresult);
        final EditText amount = (EditText) findViewById(R.id.editamount);

        btsend = (Button) findViewById(R.id.btsend);
        btsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double conversao = 0.0;
                double peso = 8.46;
                double dolar = 5.02;
                double cotacaodolp = 0.02347;

                String valor = amount.getText().toString().trim();

                if(frombr.isChecked() && tobr.isChecked()){
                    ver_check.setText(valor + " BRL");
                }
                else if(frombr.isChecked() && touy.isChecked()){
                    conversao = (Double.valueOf(valor) * peso);
                    NumberFormat z = NumberFormat.getCurrencyInstance();
                    NumberFormat.getCurrencyInstance().format(conversao);

                    String convert = conversao.toString().trim();

                    ver_check.setText(convert + " UYU");
                }
                else if(frombr.isChecked() && tous.isChecked()){
                    conversao = (Double.valueOf(valor) / dolar);
                    NumberFormat z = NumberFormat.getCurrencyInstance();
                    NumberFormat.getCurrencyInstance().format(conversao);

                    String convert = conversao.toString().trim();

                    ver_check.setText(convert + " USD");
                }
                else if(fromuy.isChecked() && touy.isChecked()){
                    ver_check.setText(valor + " UYU");
                }
                else if(fromuy.isChecked() && tobr.isChecked()){
                    conversao = (Double.valueOf(valor) / peso);
                    NumberFormat z = NumberFormat.getCurrencyInstance();
                    NumberFormat.getCurrencyInstance().format(conversao);

                    String convert = conversao.toString().trim();

                    ver_check.setText(convert + " BRL");
                }
                else if(fromuy.isChecked() && tous.isChecked()){
                    conversao = (Double.valueOf(valor) * cotacaodolp);
                    NumberFormat z = NumberFormat.getCurrencyInstance();
                    NumberFormat.getCurrencyInstance().format(conversao);

                    String convert = conversao.toString().trim();

                    ver_check.setText(convert + " USD");
                }
                else if(fromus.isChecked() && tous.isChecked()){
                    ver_check.setText(valor + " USD");
                }
                else if(fromus.isChecked() && tobr.isChecked()){
                    conversao = (Double.valueOf(valor) * dolar);
                    NumberFormat z = NumberFormat.getCurrencyInstance();
                    NumberFormat.getCurrencyInstance().format(conversao);

                    String convert = conversao.toString().trim();

                    ver_check.setText(convert + " BRL");
                }
                else if(fromus.isChecked() && touy.isChecked()){
                    conversao = (Double.valueOf(valor) / cotacaodolp);
                    NumberFormat z = NumberFormat.getCurrencyInstance();
                    NumberFormat.getCurrencyInstance().format(conversao);

                    String convert = conversao.toString().trim();

                    ver_check.setText(convert + " UYU");
                }
            }
        });
    }
}