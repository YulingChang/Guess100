package com.lisa.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random r = new Random();
    int n = r.nextInt(100)+1;
    int min = 1;
    int max = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}






            public void guess100 (View view) {
               
                EditText edsecret = (EditText) findViewById(R.id.secret);
                EditText edinfo = (EditText) findViewById(R.id.info);
                EditText ednum = (EditText) findViewById(R.id.number);
                Button bSend = (Button) findViewById(R.id.send);
                int s = Integer.parseInt(ednum.getText().toString());



                if (n<s){
                    max = s;
                    Toast.makeText(this,"Please enter a number"+min+"-"+max,Toast.LENGTH_LONG)
                            .show();
                }
                if (n>s){
                    min = s;
                    Toast.makeText(this,"Please enter a number"+min+"-"+max,Toast.LENGTH_LONG)
                            .show();
                }
                if (n==s){
                    new AlertDialog.Builder(this)
                            .setMessage("bingo")
                            ,setTitle("end")
                            .setPositiveButton("ok",null)
                            .show();
                }



            }