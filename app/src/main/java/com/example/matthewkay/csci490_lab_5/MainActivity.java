package com.example.matthewkay.csci490_lab_5;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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


        submit = (Button) findViewById(R.id.submit);
        list = (Button) findViewById(R.id.list);
        enter = (EditText) findViewById(R.id.enterName);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "THis works" + enter.getText(),
                        Toast.LENGTH_LONG).show();
                submitToDatabase(enter.getText().toString());

            }
        });

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "LISTTTTT",
                        Toast.LENGTH_LONG).show();
                retriveName();
            }
        });


        labDB = Room.databaseBuilder(this, LabDatabase.class, DATABASE_NAME)
                .build();


    }

    private void submitToDatabase(String name){
        asyncTask task = new asyncTask(labDB);
        task.execute(name);
    }
    private void retriveName(){
        asyncTask2 task2 = new asyncTask2(labDB, getApplicationContext());
        task2.execute();
    }


}
