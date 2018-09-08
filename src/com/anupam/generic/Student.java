package com.anupam.generic;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public abstract class Student {
    private String name;
    private int registrationID;

    public Student() {
    }

    public Student(String name, int registrationID) {
        this.name = name;
        this.registrationID = registrationID;
    }

    public String getName() {
        return name;
    }

    public int getRegistrationID() {
        return registrationID;
    }

    @Override
    public String toString() {
        return "Student Name: " + getName() + "  Registration ID: " + getRegistrationID() ;
    }
}
