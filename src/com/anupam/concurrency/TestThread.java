package com.anupam.concurrency;
//import static com.anupam.concurrency.ThreadColor.ANSI_BLUE;
//import static com.anupam.concurrency.ThreadColor.ANSI_CYAN;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class TestThread {
    public static void main(String[] args) {
        AnotherThread anotherThread = new AnotherThread();
        //System.out.println(ANSI_BLUE + "Before Thread start");

        anotherThread.start();
        try {
            anotherThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        }
       // System.out.println(ANSI_CYAN+"After Thread finish");
        //anotherThread.interrupt();


    }
}
