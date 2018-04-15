package com.example.matthewkay.csci490_lab_5;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.matthewkay.csci490_lab_5.async.asyncTask;
import com.example.matthewkay.csci490_lab_5.async.asyncTask2;
import com.example.matthewkay.csci490_lab_5.data.LabDatabase;

public class MainActivity extends AppCompatActivity {

    private static final String DATABASE_NAME = "person_db";
    LabDatabase labDB;
    Button submit, list;
    EditText enter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    labDB = Room.databaseBuilder(this, LabDatabase.class, DATABASE_NAME).build();



    enter = findViewById(R.id.enterName);

    submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(),enter.getText().toString(), Toast.LENGTH_SHORT).show();
            submitToDatabase(enter.getText().toString());
            enter.setText("");
        }
    });
    list = findViewById(R.id.list);
        list.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(),"Listing names", Toast.LENGTH_SHORT).show();
            retrieveName();
        }

        });


}
    private void submitToDatabase(String name)
    {
        asyncTask myAsyncTask = new asyncTask(labDB);
        myAsyncTask.execute(name);
    }

    private void retrieveName()
    {
        asyncTask2 myAsyncTask2 = new asyncTask2(labDB, getApplicationContext());
        myAsyncTask2.execute();
    }




}
