package com.example.codingevaluation_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtnLogin;
    private EditText mEtEmail, mEtPassword;
    private boolean isRemeberchecked = false;
    private CheckBox mCBRememberme;
    private final String emailValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnLogin = findViewById(R.id.btnLogin);
        mCBRememberme = findViewById(R.id.btnRemember);
        mEtEmail = findViewById(R.id.etEmail);
        mEtPassword = findViewById(R.id.etPass);


        mBtnLogin.setOnClickListener(this);
        mCBRememberme.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        boolean isEmailValid = isEmailvalid();
        boolean isPasswordValid = isPasswordValid();

        if(v.getId()== R.id.btnLogin && isEmailValid && isPasswordValid){
            if(isRemeberchecked){
                Intent intent = new Intent(MainActivity.this,HomeScreen.class);
                startActivity(intent);
            }else {
                Intent intent = new Intent(MainActivity.this,HomeScreen.class);
                startActivity(intent);
            }
        }else if(v.getId() == R.id.btnRemember){
            isRemeberchecked = true;
        }
    }


    private boolean isEmailvalid(){
        if(mEtEmail.getText().toString().matches(emailValidation)){
            return true;
        }else{
            mEtEmail.setError("Invalid Email Id");
            return false;
        }
    }

    private boolean isPasswordValid(){
        if(mEtPassword.getText().length()>=6){
            return true;
        }else {
            mEtPassword.setError("Length too short!");
            return false;
        }
    }
}