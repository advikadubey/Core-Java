package com.anupam.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class PreviousAndNextLinkedList {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<String> myName = new LinkedList<String>();
//        MyLinkedList myLinkedList = new MyLinkedList();
        MyLinkedList.addItemInLinkedList("Neha",myName);
        MyLinkedList.addItemInLinkedList("Anupam",myName);
        MyLinkedList.addItemInLinkedList("Advika",myName);
        MyLinkedList.addItemInLinkedList("Gouri",myName);
        MyLinkedList.addItemInLinkedList("SomDutt",myName);
        MyLinkedList.addItemInLinkedList("Madhu",myName);
        MyLinkedList.addItemInLinkedList("Arvind",myName);
        MyLinkedList.printCity(myName);
//        City(myName);

        boolean run = true;
        ListIterator listItr = myName.listIterator();
        while (run){
            System.out.println("Enter choice to traverse list 1-Next  :  2-Previous");
            //scanner.nextLine();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Break program");
                    run = false;
                case 1:
                    if (listItr.hasNext()) {
                        System.out.println("Name in List is: " + listItr.next() );
                    }
                    break;
                case 2:
                    if (listItr.hasPrevious()) {
                        System.out.println("Name in List is: " + listItr.previous() );
                    }
                    break;

            }
        }



    }
}
