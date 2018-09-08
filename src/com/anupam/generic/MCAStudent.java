package com.anupam.generic;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class MCAStudent extends Student {
    private String [] subjects;

    public MCAStudent(String[] subjects) {
        this.subjects = subjects;
    }

    public MCAStudent(String name, int registrationID, String[] subjects) {
        super(name, registrationID);
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        String subject = "";
        for (int i=0; i<subjects.length; i++) {
            subject+=" , "+subjects[i];
        }
        String value = super.toString()+ "  Subject name: []" +subject;
        return value ;
    }
}
