package com.example.khan1.fourthapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openLogin();
        openReg();

    }


    public void openLogin(){
        btn =(Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent=new Intent("com.example.khan1.fourthapp.Login");
                startActivity(intent);
            }
        });
    }

    public void openReg(){
        btn =(Button) findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent=new Intent("com.example.khan1.fourthapp.Register");
                startActivity(intent);
            }
        });



    }
}
