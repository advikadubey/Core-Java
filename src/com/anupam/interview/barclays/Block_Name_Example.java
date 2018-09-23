package com.anupam.interview.barclays;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class Block_Name_Example {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        first:{

            second:{
                System.out.println("Left shift value: " + (b >> 1));
                if (a == b >> 1) {
                    break first; //it will execute so break block first and sout will not print for value - a
                }
            }
            System.out.println(a); //control will not reach here
        }
        System.out.println(b); // only 10 will print.
    }
}
