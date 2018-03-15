package com.example.matthewkay.csci490_lab_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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
            }
        });

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "LISTTTTT",
                        Toast.LENGTH_LONG).show();
            }
        });


    }
}
