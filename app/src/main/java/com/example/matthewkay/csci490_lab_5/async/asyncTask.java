package com.example.matthewkay.csci490_lab_5.async;

import android.content.Context;
import android.os.AsyncTask;

import com.example.matthewkay.csci490_lab_5.data.LabDatabase;
import com.example.matthewkay.csci490_lab_5.entities.Person;

/**
 * Created by MatthewKay on 3/15/18.
 */

public class asyncTask extends AsyncTask<String, Void, Void> {
    LabDatabase database;
    public asyncTask(LabDatabase database){
        this.database = database;
    }


    @Override
    protected Void doInBackground(String... strings) {
        Person person = new Person();
        person.setName(strings[0]);
        database.personDao().insertPerson(person);
        return null;

    }
}
