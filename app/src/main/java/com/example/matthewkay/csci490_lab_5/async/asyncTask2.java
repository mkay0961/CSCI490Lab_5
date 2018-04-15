package com.example.matthewkay.csci490_lab_5.async;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.example.matthewkay.csci490_lab_5.PersonsActivity;
import com.example.matthewkay.csci490_lab_5.data.LabDatabase;
import com.example.matthewkay.csci490_lab_5.entities.Person;

import java.util.ArrayList;

/**
 * Created by MatthewKay on 3/15/18.
 */

public class asyncTask2 extends AsyncTask<Void,Void,ArrayList<Person>> {


    LabDatabase personDB;
    Context context;
    public asyncTask2(LabDatabase personDB, Context context)
    {
        this.personDB = personDB;
        this.context = context;
    }

    @Override
    protected void onPostExecute(ArrayList<Person> persons)
    {
        super.onPostExecute(persons);
        ArrayList<String> personNames = new ArrayList<>();
        for(Person p: persons) {
            personNames.add(p.getName());
        }

        Intent i = new Intent(context,PersonsActivity.class);
        i.putExtra("Persons", personNames);
        context.startActivity(i);
    }

    @Override
    protected ArrayList<Person> doInBackground(Void... voids)
    {
        ArrayList<Person> persons = (ArrayList) personDB.personDao().getAllPersons();
        return persons;
    }

}
