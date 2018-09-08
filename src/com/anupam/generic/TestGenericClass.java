package com.anupam.generic;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class TestGenericClass {

    public static void main(String[] args) {


        BEStudent beStd1 = new BEStudent("Abhishek", 102031, "CS");
        BEStudent beStd2 = new BEStudent("Rahul", 102032, "IT");
        BEStudent beStd3 = new BEStudent("Ajay", 102033, "EC");
        BEStudent beStd4 = new BEStudent("Mukesh", 102034, "CS");

        MCAStudent mcaStudent1 = new MCAStudent("Anupam", 809020, new String[]{"AAA", "BBB", "CCC", "DDD", "EEE"});
        MCAStudent mcaStudent2 = new MCAStudent("Aayush", 809021, new String[]{"AAA", "BBB", "CCC", "DDD", "EEE"});
        MCAStudent mcaStudent3 = new MCAStudent("Vipin", 809022, new String[]{"AAA", "BBB", "CCC", "DDD", "EEE"});
        MCAStudent mcaStudent4 = new MCAStudent("Preeti", 809023, new String[]{"AAA", "BBB", "CCC", "DDD", "EEE"});


        Department<BEStudent> department = new Department("ITM");
        department.addStudents(beStd1);
        department.addStudents(beStd2);
        department.addStudents(beStd3);
        department.addStudents(beStd4);

        Department<MCAStudent> departmentMca = new Department("ITM");
        departmentMca.addStudents(mcaStudent1);
        departmentMca.addStudents(mcaStudent2);
        departmentMca.addStudents(mcaStudent3);
        departmentMca.addStudents(mcaStudent4);

        department.printCollege();
        System.out.println("\n");
        departmentMca.printCollege();
    }
}
