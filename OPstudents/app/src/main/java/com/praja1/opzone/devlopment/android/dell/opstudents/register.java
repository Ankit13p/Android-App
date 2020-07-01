package com.praja1.opzone.devlopment.android.dell.opstudents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    UserDAO dao;
    EditText id, fname, lname, dob, uname, password, street, suburb, city, postcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        dao = UserDatabase.getDBInstance(this).userDAO();

        fname =  findViewById(R.id.fn_edittext);
        lname = findViewById(R.id.ln_edittext);
        dob = findViewById(R.id.dob_edittext);
        uname = findViewById(R.id.user_edittext);
        password = findViewById(R.id.psd_editext);
        street = findViewById(R.id.street_edittext);
        suburb = findViewById(R.id.suburb_edittext);
        city = findViewById(R.id.city_edittext);
        postcode = findViewById(R.id.post_edittext);
    }

    public void clear (View view) {
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }

    public void register(View view) {
        User u = new User();

        u.setFirstName(fname.getText().toString());
        u.setLastName(lname.getText().toString());
        u.setDOB(dob.getText().toString());
        u.setUserName(uname.getText().toString());
        u.setPassword(password.getText().toString());
        u.setStreet(street.getText().toString());
        u.setSuburb(suburb.getText().toString());
        u.setCity(city.getText().toString());
        u.setPostcode(postcode.getText().toString());

        dao.insertUser(u);

        //finish();

        Intent intent = new Intent(this, signup_signin.class);
        startActivity(intent);
        Toast.makeText(
                this,
                "Register sucessfully!",
                Toast.LENGTH_LONG
        ).show();
    }

    public void back(View view) {
       Intent intent = new Intent(this, signup_signin.class);
       startActivity(intent);
    }
}
