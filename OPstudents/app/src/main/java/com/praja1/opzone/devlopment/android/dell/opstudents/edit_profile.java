package com.praja1.opzone.devlopment.android.dell.opstudents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class edit_profile extends AppCompatActivity {

    UserDAO dao;
    EditText fname, lname, dob, uname, password, street, suburb, city, postcode;
    String userName;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);


        dao = UserDatabase.getDBInstance(this).userDAO();
        userName = getIntent().getStringExtra("USER_NAME");
        user = dao.getUserAllInfo(userName).get(0);

        fname =  findViewById(R.id.fn_ep_edittext);
        lname = findViewById(R.id.ln_ep_edittext);
        dob = findViewById(R.id.dob_ep_edittext);
        uname = findViewById(R.id.user_ep_edittext);
        password = findViewById(R.id.psd_ep_editext);
        street = findViewById(R.id.street_ep_edittext);
        suburb = findViewById(R.id.suburb_ep_edittext);
        city = findViewById(R.id.city_ep_edittext);
        postcode = findViewById(R.id.post_ep_edittext);

        Toast.makeText(this, "Ready to edit Profile", Toast.LENGTH_LONG).show();

        fname.setText(user.getFirstName());
        lname.setText(user.getLastName());
        dob.setText(user.getDOB());
        uname.setText(user.getUserName());
        password.setText(user.getPassword());
        street.setText(user.getStreet());
        suburb.setText(user.getSuburb());
        city.setText(user.getCity());
        postcode.setText(user.getPostcode());
    }

    public void update(View view) {

        user.setFirstName(fname.getText().toString());
        user.setLastName(lname.getText().toString());
        user.setDOB(dob.getText().toString());
        user.setUserName(uname.getText().toString());
        user.setPassword(password.getText().toString());
        user.setStreet(street.getText().toString());
        user.setSuburb(suburb.getText().toString());
        user.setCity(city.getText().toString());
        user.setPostcode(postcode.getText().toString());

        if(dao.updateUser(user) == 1)
            Toast.makeText(this, "Successly updated", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Fail to update", Toast.LENGTH_LONG).show();

       finish();
    }

    public void cancel(View view) {
        finish();
    }

    public void back(View view) {
       finish();
    }
}
