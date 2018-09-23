package com.anupam.interview.barclays;

import java.util.TreeSet;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class TreeSet_Example {

    public static void main(String[] args) throws Exception{
        TreeSet t = new TreeSet();
        try {
            t.add(new StringBuffer("H"));
            t.add(new StringBuffer("A"));
            t.add(new StringBuffer("C"));
            t.add(new StringBuffer("K"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        t.add(new String("A"));

        System.out.println("value of TreeSet: " + t);//Exception
    }
}
