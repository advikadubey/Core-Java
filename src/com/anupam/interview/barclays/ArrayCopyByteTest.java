package com.anupam.interview.barclays;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class ArrayCopyByteTest {

    public static void main(String[] args) {

        byte[] a = {65, 66, 67, 68, 69, 70};
        byte[] b = {71, 72, 73, 74, 75, 76};

        System.out.println("Before array-copy: ");
        System.out.println(new String(a) + "  " + new String(b));

        System.arraycopy(a, 2, b, 1, a.length - 3);

        System.out.println("\nAfter array-copy: ");
        System.out.println(new String(a) + "  " + new String(b));
    }

}
