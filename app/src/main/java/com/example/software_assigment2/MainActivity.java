package com.example.software_assigment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e ;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button);
        e = (EditText) findViewById(R.id.name);
        t = (TextView) findViewById(R.id.hello);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String st = e.getText().toString();
                sendData(st);
            }
        });


    }
    private void sendData(String st){
        t.setText("Hello "+st);
    }
    }
