package com.anupam.collections;

import java.util.*;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class Run_Student_Set {

    static Set<Student_Set> mySet = new HashSet<>();

    public static void main(String[] args) {

        Student_Set student1 = new Student_Set("Anupam", 101);
        student1.addSubject("Maths");
        mySet.add(student1);

        Student_Set student2 = new Student_Set("Arun", 102);
        student2.addSubject("Physics");
        mySet.add(student2);

        Student_Set student3 = new Student_Set("Shalini", 103);
        student3.addSubject("History");
        mySet.add(student3);

        Student_Set student4 = new Student_Set("Manish", 104);
        student4.addSubject("IT");
        mySet.add(student4);

        Student_Set student5 = new Student_Set("Samir", 105);
        student5.addSubject("CS");
        mySet.add(student5);

        Student_Set student6 = new Student_Set("Anupam", 101);
        student6.addSubject("Maths");
        mySet.add(student6);

        System.out.println("Students list are as follows: \n");
        //Collections.sort(mySet);
//        TreeSet<Student_Set> myTreeSet = new TreeSet();
//////        myTreeSet.addAll(mySet);

        /* Below is the way to sort Set collection
        * so in class Student_Set will have to implement Comparable interface
        * and over-ride compareTo method*/
        List<Student_Set> list = new ArrayList<>(mySet);
        Collections.sort(list);

        for (Student_Set student : list) {
            System.out.println("Studen name: " + student.getName() + " Student-ID: " + student.getId() + " Student Subject: " + student.getSubjects().toString());

        }




    }


}
