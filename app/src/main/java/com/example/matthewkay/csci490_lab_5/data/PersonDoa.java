package com.example.matthewkay.csci490_lab_5.data;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.matthewkay.csci490_lab_5.entities.Person;

import java.util.List;

/**
 * Created by MatthewKay on 3/15/18.
 */

public interface PersonDoa {
    @Insert
    void insertPerson(Person person);

    @Query("SELECT * FROM Person")
    List<Person> getAllPersons();

}
