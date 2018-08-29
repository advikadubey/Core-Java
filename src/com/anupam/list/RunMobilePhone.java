package com.anupam.list;

import java.util.Scanner;

/**
 * Created by ANUPAM DUBE on Aug, 2018
 **/
public class RunMobilePhone {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ContactList list = new ContactList("Anupam", "7489275953");
        MobilePhone phone = new MobilePhone();
        phone.addNewContact(list);

        printAction();
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    //addContact();
                    break;
                case 2:
                    //updateContact();
                    break;
                case 3:
                    //deleteContact();
                case 4:
                    //printContact();
                    break;
                case 5:
                    //queryContact();
                    break;
                case 6:
                    printAction();
                    break;

            }
        }


    }

    static void printAction() {
        System.out.println("\nAvailable actions:\nPress");
        System.out.println("0 -  to shut down\n" +
                "1 - to print list" +
                "2 - to add contact");
    }
}
