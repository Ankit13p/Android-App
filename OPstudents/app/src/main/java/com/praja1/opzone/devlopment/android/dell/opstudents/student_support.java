package com.praja1.opzone.devlopment.android.dell.opstudents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class student_support extends AppCompatActivity {
    ListView listView;

    static String [] mydatasource = {"Hamish Oakley \n" +
                    "Student Success Manager\n" +
                    "Hamish.Oakley@op.ac.nz\n" +
                    "+64 9 309 0301 ext. 308",
            "Mariam Almasri \n" +
                    "Student Support Advisor \n" +
                    "Mariam.Almasri@op.ac.nz\n" +
                    "+64 9 309 0301 ext. 311",
            "Ellen Yu \n" +
                    "Student Counsellor \n" +
                    "Ellen.Yu@op.ac.nz \n" +
                    "+64 9 309 0301 ext. 802",
            "Artemis Shirvani \n" +
                    "Events Coordinator\n" +
                    "Artemis.Shirvani@op.ac.nz\n" +
                    "+64 9 309 0301 ext. 805"};

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_support);

        listView = findViewById(R.id.myListView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                R.layout.item_layout,
                mydatasource
        );

        listView.setAdapter(arrayAdapter);
    }

    public void opLogo(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
