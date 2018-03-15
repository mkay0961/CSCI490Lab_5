package com.example.matthewkay.csci490_lab_5.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.matthewkay.csci490_lab_5.entities.Person;

/**
 * Created by MatthewKay on 3/15/18.
 */

@Database(entities = {Person.class}, version = 1)
public abstract class LabDatabase extends RoomDatabase {

    public abstract PersonDoa personDao();
}
