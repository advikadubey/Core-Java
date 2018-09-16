package com.anupam.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class Theatre {
    private String threatreName;
    private List<Seat> seat = new ArrayList<>();

    public Theatre(String threatreName, int numRows, int seatsPerRow) {
        this.threatreName = threatreName;

        for (char row = 'A'; row<= 'A'+numRows; row++) {
            for (int i = 1 ; i<= seatsPerRow; i++) {
                Seat s = new Seat(row+String.format("%02d",i));
                seat.add(s);
            }
        }
    }

    public List<Seat> getSeat() {
        return seat;
    }

    //for testing
    public void printSeats() {
        for (Seat seat : seat) {
            System.out.println("" + seat.getSeatNumber());
        }
    }
    




    private class Seat{
        private final String seatNumber;
        private boolean reserved = false ;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        private String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserve() {
            if (!reserved) {
                reserved = true;
                System.out.println("Seat " + seatNumber + " reserved!");
                return true;
            } else {
                System.out.println("Seat " + seatNumber + " already booked!!!!!!");
                return false ;
            }

        }

        public boolean cancel() {
            if (reserved) {
                reserved = false ;
                System.out.println("Seat number " + seatNumber + " reservation has been cancelled");
                return true ;
            }else{
                System.out.println("");
                return false ;
            }
        }
    }
}
