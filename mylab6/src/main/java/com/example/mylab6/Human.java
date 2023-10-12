package com.example.mylab6;

import java.io.Serializable;

public abstract class Human implements Serializable {
    protected String name;
    protected String secondName;
    Human(String name, String secondName){
        this.name = name;
        this.secondName = secondName;
    }
    public String getName(){
        return name;
    }

    public String getSecondName(){
        return secondName;
    }
}
