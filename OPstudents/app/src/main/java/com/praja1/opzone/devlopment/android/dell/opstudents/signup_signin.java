package com.praja1.opzone.devlopment.android.dell.opstudents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class signup_signin extends AppCompatActivity {
    private UserDAO dao;

    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_signin);
        dao = UserDatabase.getDBInstance(this).userDAO();

        username = findViewById(R.id.username_edit);
        password = findViewById(R.id.password_edit);
    }

    public void opLogo(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void register(View view) {
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }

    public void login(View view) {
        String userName = username.getText().toString();
        String pswd = password.getText().toString();
        List<User> userL = dao.getUser(userName);
        if(userL.isEmpty()){
            Toast.makeText(
                    this,
                    "User Name does not exist!",
                    Toast.LENGTH_LONG
            ).show();
        } else
        {
            if(userL.get(0).getPassword().equals(pswd)){
                Toast.makeText(
                        this,
                        "Welcome " + userName,
                        Toast.LENGTH_LONG
                ).show();
                Intent intent = new Intent(getApplicationContext(),user_detail.class);
                intent.putExtra("USER_NAME",userName);
                startActivity(intent);
            }
            else
            {
                Toast.makeText(
                        this,
                        "User Password is wrong!",
                        Toast.LENGTH_LONG
                ).show();
            }
        }
    }
}
