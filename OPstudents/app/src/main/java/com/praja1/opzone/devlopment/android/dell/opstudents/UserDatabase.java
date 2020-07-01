package com.praja1.opzone.devlopment.android.dell.opstudents;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class UserDatabase extends RoomDatabase {
    private static UserDatabase userDatabase = null;

    public  abstract UserDAO userDAO();

    public static UserDatabase getDBInstance(Context context){
        if (userDatabase == null){
            userDatabase = Room.databaseBuilder(
                    context.getApplicationContext(),
                    UserDatabase.class,
                    "MY_USER_DB"
            )
                    .allowMainThreadQueries()
                    .build();
        }
        return userDatabase;
    }
}
