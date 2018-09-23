package com.anupam.interview.barclays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class HashSet_Example {

    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("One");
        hashSet.add("Four");

        System.out.println(hashSet);

        List l = null;
        l = new ArrayList();
        l.add("One");
        l.add("Two");
        l.add("Three");

        /* retains all matching elements in the current ArrayList instance
        that match all elements from the Collection list passed as a parameter to the method.*/
        hashSet.retainAll(l);

        System.out.println("Size: " + l.size() + hashSet.size());
    }
}
