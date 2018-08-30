package com.anupam.list;

import java.util.Scanner;

/**
 * Created by ANUPAM DUBE on Aug, 2018
 **/
public class RunMobilePhone {

    static Scanner scanner = new Scanner(System.in);
    static  MobilePhone phone = MobilePhone.getSingletonMobilePhone();

    public static void main(String[] args) {

        ContactList list = new ContactList("myAnupam", "000007489275953");
        phone.addNewContact(list);

        printAction();
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter Your Choice:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("System is going to shutting down");
                    quit = true;
                    break;
                case 1:
                    boolean addFlag = addContact();
                    if (addFlag)
                        System.out.println("Added Done!");
                    break;
                case 2:
                    //updateContact();
                    break;
                case 3:
                    //deleteContact();
                case 4:
                    printContact();
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

    static void printContact() {
//        MobilePhone mPhone = new MobilePhone();
        phone.printMobilePhoneList();
    }
    static boolean addContact() {
        System.out.println("Enter name:");
        String name = scanner.next();
        scanner.nextLine();
        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();
        ContactList contactList = new ContactList(name, phoneNumber);
        //MobilePhone mPhone = new MobilePhone();
        return phone.addNewContact(contactList);
    }
    static void printAction() {
        System.out.println("\nAvailable actions:\nPress");
        System.out.println("0 -  to shut down\n" +
                "1 - to add contact\n" +
                "2 - Update contact\n" +
                "3 - Delete contact\n" +
                "4 - Print contact\n" +
                "5 - Query contact\n" +
                "6 - Print action again\n");
    }
}
