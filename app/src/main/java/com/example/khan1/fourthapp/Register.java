package com.example.khan1.fourthapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText uname,pass,gend,colg;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        reg();
    }


    public void reg(){
        uname = (EditText) findViewById(R.id.editText3);
        gend = (EditText) findViewById(R.id.editText4);
        colg = (EditText) findViewById(R.id.editText5);
        pass = (EditText) findViewById(R.id.editText6);

        btn=(Button)findViewById(R.id.button4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Register.this, "username " ,Toast.LENGTH_SHORT).show();

                //Toast.makeText(Register.this, "gender "+gend ,Toast.LENGTH_SHORT).show();

//                Toast.makeText(Register.this, "college "+colg ,Toast.LENGTH_SHORT).show();

//                Toast.makeText(Register.this, "password "+pass ,Toast.LENGTH_SHORT).show();


//                if(uname.getText().toString().equals("admin") && pass.getText().toString().equals("admin"))
//                {
//                    Toast.makeText(Register.this, "successfully loggedin" ,Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(Register.this, "invalid user or password" ,Toast.LENGTH_SHORT).show();
//                }
            }
        });
    }
}
