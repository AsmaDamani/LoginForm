package com.example.saif.loginform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText PhoneET,PasswordET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PhoneET=(EditText)findViewById(R.id.editText);
        PasswordET=(EditText)findViewById(R.id.editText2);
    }
public  void OnLogin(View view)
{
    String Phone=PhoneET.getText().toString();
    String Password=PasswordET.getText().toString();
    String type="Login";
    Background background=new Background(this);
    background.execute(type,Phone,Password);
}
public void OpenReg(View view){
startActivity(new Intent(this,Register.class));
}
}
