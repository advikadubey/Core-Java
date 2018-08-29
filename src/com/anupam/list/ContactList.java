package com.anupam.list;

/**
 * Created by ANUPAM DUBE on Aug, 2018
 **/
public class ContactList {
    private String name ;
    private String phoneNumber;

    public ContactList(String name, String number) {
        this.name = name;
        this.phoneNumber = number;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
