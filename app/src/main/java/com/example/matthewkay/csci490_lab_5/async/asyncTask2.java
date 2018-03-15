package com.example.matthewkay.csci490_lab_5.async;

import android.content.Context;
import android.os.AsyncTask;

import com.example.matthewkay.csci490_lab_5.data.LabDatabase;
import com.example.matthewkay.csci490_lab_5.entities.Person;

import java.util.ArrayList;

/**
 * Created by MatthewKay on 3/15/18.
 */

public class asyncTask2 extends AsyncTask<Void,Void,ArrayList<Person>> {
    LabDatabase person;
    Context context;

    public asyncTask2(LabDatabase personDB, Context context){
        this.person = personDB;
        this.context = context;
    }



    @Override
    protected ArrayList<Person> doInBackground(Void... voids) {
        return null;
    }
}
