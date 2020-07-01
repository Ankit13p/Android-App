package com.praja1.opzone.devlopment.android.dell.opstudents;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
@Entity(tableName = "Users")
public class User {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "User_id")
    private int user_id;

    @ColumnInfo(name = "First_name")
    private String firstName;

    @ColumnInfo(name = "Last_name")
    private String lastName;

    @ColumnInfo(name = "Date_Of_Birth")
    private String DOB;

    @ColumnInfo(name = "User_name")
    private String userName;

    private String password;

    @ColumnInfo(name = "Street")
    private String street;

    @ColumnInfo(name = "Suburb")
    private String suburb;

    @ColumnInfo(name = "City")
    private String city;

    @ColumnInfo(name = "Postcode")
    private String postcode;

    public int getUser_id() {
        return user_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getStreet() {
        return street;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
