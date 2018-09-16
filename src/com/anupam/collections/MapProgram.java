package com.anupam.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();
        System.out.println(myMap.put("101", "Anupam"));
        myMap.put("102", "Advika");
        myMap.put("103", "Neha");
        myMap.put("104", "Madhu");

        System.out.println(myMap.put("101","Dubey"));
        
        for (String key : myMap.keySet()) {
            System.out.println("" + key + " :-> "+myMap.get(key));
        }
    }
}
