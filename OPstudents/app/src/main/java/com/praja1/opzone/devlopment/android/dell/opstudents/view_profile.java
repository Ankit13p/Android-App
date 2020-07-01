package com.praja1.opzone.devlopment.android.dell.opstudents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class view_profile extends AppCompatActivity {
    UserDAO dao;
    TextView fname, lname, dob, uname, password, street, suburb, city, postcode;
    String userName;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);
        dao = UserDatabase.getDBInstance(this).userDAO();
        userName = getIntent().getStringExtra("USER_NAME");
        user = dao.getUserAllInfo(userName).get(0);

        fname =  findViewById(R.id.fname_vp_txt);
        lname = findViewById(R.id.lname_vp_txt);
        dob = findViewById(R.id.dob_vp_txt);
        uname = findViewById(R.id.user_vp_txt);
        password = findViewById(R.id.password_vp_txt);
        street = findViewById(R.id.street_vp_txt);
        suburb = findViewById(R.id.suburb_vp_txt);
        city = findViewById(R.id.city_vp_txt);
        postcode = findViewById(R.id.postcode_vp_txt);

        fname.setText(user.getFirstName());
        lname.setText(user.getLastName());
        dob.setText(user.getDOB());
        uname.setText("User name: "+user.getUserName());
        password.setText("Password: "+user.getPassword());
        street.setText(user.getStreet());
        suburb.setText(user.getSuburb());
        city.setText(user.getCity());
        postcode.setText(user.getPostcode());

    }

    public void ok(View view) {
        finish();
    }

    public void back(View view) {
        finish();
    }
}
