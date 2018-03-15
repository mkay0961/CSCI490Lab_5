package com.example.matthewkay.csci490_lab_5.entities;

/**
 * Created by MatthewKay on 3/15/18.
 */

public class Person {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
