package com.praja1.opzone.devlopment.android.dell.opstudents;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import java.util.Queue;
import java.util.List;


@Dao
public interface UserDAO {
    @Query("select * from Users")
    List<User> readAll();

    @Query(" Select User_id, User_name, password from Users where User_name like :user_Name")
    List<User> getUser(String user_Name);

    @Query("select * from Users where User_name like :userName")
    List<User> getUserAllInfo(String userName);

    @Insert
    long insertUser(User user);

   /* @Insert
    void insertUsers(User... users);*/

    @Update
    int updateUser(User user);

    @Delete
    int deleteStudent (User user);


}

