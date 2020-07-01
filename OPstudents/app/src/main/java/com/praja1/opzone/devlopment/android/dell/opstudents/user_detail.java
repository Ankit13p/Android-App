package com.praja1.opzone.devlopment.android.dell.opstudents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class user_detail extends AppCompatActivity {

    String USER_NAME;
    UserDAO dao;
    User user;
    TextView welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        //USER_NAME = getIntent().getStringExtra("USER_NAME");

        dao = UserDatabase.getDBInstance(this).userDAO();
        USER_NAME = getIntent().getStringExtra("USER_NAME");
        user = dao.getUserAllInfo(USER_NAME).get(0);
        welcome = findViewById(R.id.user_name_text);
        welcome.setText("Welcome "+(user.getUserName()));

    }

    public void editProfile(View view) {
        Intent intent = new Intent(this,edit_profile.class);
        intent.putExtra("USER_NAME", USER_NAME);
        startActivity(intent);
    }

    public void view_profile(View view) {
        Intent intent = new Intent(this,view_profile.class);
        intent.putExtra("USER_NAME", USER_NAME);
        startActivity(intent);
    }

    public void delete(View view) {
        Toast.makeText(this, user.getUserName()+" detail delete Sucessfully.", Toast.LENGTH_LONG).show();
        dao.deleteStudent(user);
        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
    }

    public void opLogo(View view) {
        Intent intent = new Intent(getApplicationContext(),user_detail.class);
        intent.putExtra("USER_NAME",USER_NAME);
        startActivity(intent);
    }

    public void logout(View view) {
        Toast.makeText(
                this,
                "Logout Sucessfully!",
                Toast.LENGTH_LONG
        ).show();
        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
    }
}
