package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Assem");
        System.out.println(person.toString());
        Student student = new Student(3);
        student.setName("Assem");
        System.out.println(student.toString());
        Employee employee = new Employee();
        employee.setName("Assem");
        System.out.println(employee.toString());
        Faculty faculty = new Faculty();
        faculty.setName("Assem");
        System.out.println(faculty.toString());
        Staff staff = new Staff();
        staff.setName("Assem");
        System.out.println(staff.toString());
    }
}
