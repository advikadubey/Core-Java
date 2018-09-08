package com.anupam.concurrency;
import static com.anupam.concurrency.ThreadColor.ANSI_CYAN;
import static com.anupam.concurrency.ThreadColor.ANSI_RED;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class AnotherThread extends Thread {

    @Override
    public void run() {
//        super.run();
        System.out.println(ANSI_RED+"Inside run methor");
        boolean flagTrue = true;
        int count = 0;
        while (flagTrue) {
            System.out.println("Number: " + ++count);
            if (count >= 10) {
                flagTrue = false ;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return; //new InterruptedException();
            }
        }
    }
}
