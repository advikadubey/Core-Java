package com.anupam.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by ANUPAM DUBE on Aug, 2018
 **/
public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        addItemInLinkedList("Indore",list );
        addItemInLinkedList("Gwalior",list );
        addItemInLinkedList("Bhopal", list);
        addItemInLinkedList("Dewas", list);
        addItemInLinkedList("Ujjain", list);
        addItemInLinkedList("Khandwa",list );
        addItemInLinkedList("Indore", list);
        System.out.println("===============================================\n");
        printCity(list);

    }

    private static void printCity(LinkedList<String> list) {
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println("City Names: " + itr.next());
        }

    }
    private static boolean addItemInLinkedList(String cityName, LinkedList list) {
        //Iterator itr = list.iterator();
        ListIterator<String> itr = list.listIterator();
        while (itr.hasNext()) {
            int compare = itr.next().compareTo(cityName);
            System.out.println("compare val: " + compare);
            if (compare == 0) {
                System.out.println(cityName  + " city alread added!!!!");
                return false ;

            } else if (compare > 0) {
                System.out.println("compare > 0");
                itr.previous();
                itr.add(cityName);
                return true;
            } else if (compare < 0) {
                System.out.println("value lessthan");
                //return;
            }
        }
        itr.add(cityName);
        return true;

    }
}
