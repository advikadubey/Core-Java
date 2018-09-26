package com.anupam.interview.barclays;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class RunnableTest implements Runnable {

    Integer id = 1 ;

    public static void main(String[] args) {
        new Thread(new RunnableTest()).start();
        new Thread(new RunnableTest()).start();
        new Thread(new RunnableTest()).start();
    }

    public void run(){
        press(id);
    }

    synchronized void press(Integer id) {
        System.out.print(id.intValue());
        System.out.print((++id).intValue());
    }

}
