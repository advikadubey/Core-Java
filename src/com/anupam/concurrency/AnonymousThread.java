package com.anupam.concurrency;

//import static

import static com.anupam.concurrency.ThreadColor.ANSI_GREEN;
import static com.anupam.concurrency.ThreadColor.ANSI_PURPLE;
import static com.anupam.concurrency.ThreadColor.ANSI_RED;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class AnonymousThread {

    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE +"Hello from Main Thread");

        new Thread(){
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from anonymous thread ");
            }
        }.start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "Executing Runnable thread");
            }
        }).start();
        System.out.println(ANSI_PURPLE + "Exit from Main");
    }



}
