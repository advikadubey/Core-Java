package com.anupam.generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class Department<T extends Student> {
    private String collegeName ;
    private ArrayList<T> studentList = new ArrayList<>();

    public Department(String collegeName) {
        this.collegeName = collegeName;
    }

    public boolean addStudents(T student) {
        boolean addFlag = false;
        if (studentList.contains(student)) {
            System.out.println("Student already in registered");
        }else{
            System.out.println("Going to add student");
            studentList.add(student);
            addFlag = true ;
        }
        return addFlag ;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public ArrayList<T> getStudentList() {
        return studentList;
    }

    public void printCollege() {
        System.out.println("College Name: " + getCollegeName());
        System.out.println();
        ArrayList list = getStudentList();
        Iterator itr = list.iterator() ;
        while (itr.hasNext()) {
            System.out.println("Student Data: " + itr.next().toString());
        }
    }
}
