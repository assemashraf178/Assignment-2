package com.company;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Assem", 1, 2.76);
        student.setSubject("111", "CS", "3");
        student.setAddress("10", "Mallawi", "Minia");
        System.out.println(student.studentDetails());
    }
}
