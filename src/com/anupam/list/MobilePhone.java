package com.anupam.list;

import java.util.ArrayList;

/**
 * Created by ANUPAM DUBE on Aug, 2018
 **/
public class MobilePhone {

    private ContactList contact;
    private ArrayList<ContactList> contactArray;

    public MobilePhone() {
        contactArray = new ArrayList<ContactList>();
    }

    public MobilePhone(ContactList contact) {
        this.contact = contact;
    }

    public boolean addNewContact(ContactList contact) {
        int index = findContact(contact);
        if (index > 0) {
            System.out.println(contact.getName()+" contact already in file");
            return false;
        }
        this.contactArray.add(contact);
        System.out.println(contact.getName()+" added successful.");
        return true ;
    }

    private int findContact(ContactList contact) {

        return this.contactArray.indexOf(contact);
//        for (int i = 0; i < contactArray.size(); i++) {
//            ContactList con = contactArray.get(i);
//            if(con.getName().equals()){
//
//            }
//        }
    }
}
