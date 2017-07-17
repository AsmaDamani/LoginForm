package com.example.saif.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText f_name,l_name,email,contact,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        f_name=(EditText)findViewById(R.id.editText3);
        l_name=(EditText)findViewById(R.id.editText4);
        email=(EditText)findViewById(R.id.editText5);
        contact=(EditText)findViewById(R.id.editText6);
        pass=(EditText)findViewById(R.id.editText7);
    }
    public  void OnReg(View view)
    {
        String str_fname= f_name.getText().toString();
        String str_lname=l_name.getText().toString();
        String str_email=email.getText().toString();
        String str_contact=contact.getText().toString();
        String str_pass=pass.getText().toString();

        String type="Register";
        Background background=new Background(this);
        background.execute(type,str_fname,str_lname,str_email,str_contact,str_pass);
    }

    }

