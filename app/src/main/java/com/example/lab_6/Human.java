package com.example.lab_6;

import java.io.Serializable;

public abstract class Human implements Serializable {
    private String name;
    private String lastName;
    Human(){}
    Human(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public String getFirstName(){
        return name;
    }

    public String getLastName(){
        return this.lastName;
    }
}
