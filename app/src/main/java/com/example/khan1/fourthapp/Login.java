package com.example.khan1.fourthapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button btn;
    EditText uname,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login();
    }


    public void login(){
        uname = (EditText) findViewById(R.id.editText3);
        pass = (EditText) findViewById(R.id.editText6);

        btn=(Button)findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(uname.getText().toString().equals("admin") && pass.getText().toString().equals("admin"))
                {
                    Toast.makeText(Login.this, "successfully loggedin" ,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Login.this, "invalid user or password" ,Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
