package com.lisa.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bSend = (Button) findViewById(R.id.send);
        bSend.setOnClickListener(new View.OnClickListener(){




            @Override
            public void onClick(View view) {

            }

            public void guess (View view) {
                EditText edsecret = (EditText) findViewById(R.id.secret);
                EditText edinfo = (EditText) findViewById(R.id.info);


            }}}}