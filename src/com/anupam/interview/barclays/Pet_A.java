package com.anupam.interview.barclays;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class Pet_A {

    public static void main(String[] args) {
        Pet_A p = new Pet_A();
        p.start();

    }

    void start() {
        long[] a1 = {3, 4, 5};
        long[] a2 = fix(a1);
        System.out.println(a1[0] + a1[1] + a1[2]);
        System.out.println(a2[0] + a2[1] + a2[2]);
    }

    long[] fix(long[] a3) {

        a3[1] = 7 ;
        return a3;
    }
}
