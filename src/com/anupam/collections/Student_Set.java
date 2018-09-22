package com.anupam.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class Student_Set implements Comparable<Student_Set>{
    private String name;
    private Integer id;
    private Set<String> subjects;

    @Override
    public int compareTo(Student_Set student) {
        return this.getName().compareTo(student.getName());
    }

    public Student_Set(String name, Integer id) {
        this.name = name;
        this.id = id;
        this.subjects = new HashSet<>();
    }

    @Override
    public final int hashCode() {
        int hash =  this.getName().hashCode() + 57 ;
        System.out.println("Hash-value: " + hash);
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        System.out.println("Calling equals ");
        if (this == obj) {
            return true; // both objects are same.
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false ;
        }

        int id = ((Student_Set) obj).getId();
        if (this.getId() == id) {
            return true;
        }
        return false;
    }

    public void addSubject(String subject) {
        this.subjects.add(subject);
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Set<String> getSubjects() {
        return subjects;
    }
}
