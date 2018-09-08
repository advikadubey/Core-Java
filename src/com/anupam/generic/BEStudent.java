package com.anupam.generic;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class BEStudent extends Student{
    private String branchName;
//    private String

    public BEStudent(String branchName) {
        this.branchName = branchName;
    }

    public BEStudent(String name, int registrationID, String branchName) {
        super(name, registrationID);
        this.branchName = branchName;
    }

    @Override
    public String toString() {
//        super.toString() ;
        String value =  super.toString() + "  BranchName: "+branchName ;
        return value ;
    }
}
