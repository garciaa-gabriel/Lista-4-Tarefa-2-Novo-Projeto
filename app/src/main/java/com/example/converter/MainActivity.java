package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox frombr;
    private CheckBox fromuy;
    private CheckBox fromus;

    private CheckBox tobr;
    private CheckBox touy;
    private CheckBox tous;

    private TextView txtresult;
    private EditText editamount;
    private Button btsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Converter");
        getSupportActionBar().hide();

        frombr = findViewById(R.id.frombr);
        fromuy = findViewById(R.id.fromuy);
        fromus = findViewById(R.id.fromus);

        tobr = findViewById(R.id.tobr);
        touy = findViewById(R.id.touy);
        tous = findViewById(R.id.tous);


        txtresult = findViewById(R.id.txtresult);
        btsend = findViewById(R.id.btsend);

        btsend.setOnClickListener(this::OnClick);
    }

    @Override
    public void OnClick(View view){
        if(view.getId()==R.id.btsend){

        }
    }

    @Override
    public void onCheckboxClicked(View view) {
        editamount = findViewById(R.id.editamount);
        String name = editamount.getText().toString();
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.frombr:
                if (checked) {
                    switch(view.getId()) {
                        case R.id.tobr:
                            if (checked){
                                Toast.makeText(getApplicationContext(), name, Toast.LENGTH_LONG).show();
                            }
                    }
                }
            else
                // Remove the meat
                break;
            case R.id.checkbox_cheese:
                if (checked)
                // Cheese me
            else
                // I'm lactose intolerant
                break;
            // TODO: Veggie sandwich
        }
    }

}