package com.anupam.interview.barclays;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class LoopTest {
    public static void main(String[] args) {
        int j = 2, y = 3, z = 10;
        for (; j < 6; j++) {
            y = (++y + z++); //1-3+10, 2-4+11, 3-5+12, 4-6+13
            System.out.println(y + z); //y=14,z=11 //y=26,z=12 //y=39,z=13 //y=53,z=14
            //25
            //38
            //52
            //67
        }
    }
}
