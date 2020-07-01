package com.praja1.opzone.devlopment.android.dell.opstudents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void aboutOp(View view) {
        Intent intent = new Intent(
                this, know_about_op.class
        );
        startActivity(intent);
    }

    public void contactUs(View view) {
        Intent intent = new Intent(this, contact_us.class);
        startActivity(intent);
    }

    public void signup(View view) {
        Intent intent = new Intent(this, signup_signin.class);
        startActivity(intent);
    }

//    public void exit(View view) {
//        finish();
//        //System.exit(0);
//    }

    public void student_support(View view) {
        Intent intent = new Intent(this, student_support.class);
        startActivity(intent);
    }
}
