package com.praja1.opzone.devlopment.android.dell.opstudents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class contact_us extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
    }

    public void opLogo(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
