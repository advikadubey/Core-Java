package com.anupam.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by ANUPAM DUBE on Aug, 2018
 **/
public class MobilePhone {

    private ContactList contact;
    private static MobilePhone mobilePhone;
    private static ArrayList<ContactList> contactArray;// = new ArrayList<ContactList>();

    public static  MobilePhone getSingletonMobilePhone() {
        if (mobilePhone == null) {
            return new MobilePhone();
        }else
            System.out.println("contactArray object already in memory");
        return mobilePhone;

    }
    private MobilePhone() {
        contactArray = new ArrayList<ContactList>();
    }

    public MobilePhone(ContactList contact) {
        this.contact = contact;
    }

    public boolean addNewContact(ContactList contact) {
        int index = findContact(contact);
        if (index >= 0) {
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

    public void printMobilePhoneList() {
        Iterator itr = contactArray.iterator();
        ContactList contact;
        while (itr.hasNext()) {
            contact = (ContactList)itr.next();
            System.out.println("Name: "+contact.getName()+" -> "+contact.getPhoneNumber());
        }
    }
}
