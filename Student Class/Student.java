package com.company;

public class Student {
    private String name;
    private int studentID;
    private double studentGPA;
    Subject subject;
    Address address;

    public Student(){}

    public Student(String name, int studentID, double studentGPA){
        this.name = name;
        this.studentID = studentID;
        this.studentGPA = studentGPA;
        subject = new Subject();
        address = new Address();
    }
    public Student(String name, int studentID, double studentGPA, Subject subject, Address address) {
        this(name, studentID, studentGPA);
        this.subject = subject;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(double studentGPA) {
        this.studentGPA = studentGPA;
    }

    public void setSubject(String subjectID, String subjectName, String subjectHours) {
        subject.subjectID = subjectID;
        subject.subjectName = subjectName;
        subject.subjectHours = subjectHours;
    }

    public String getSubject() {
        return "Subject ID : " + subject.subjectID + ", Subject Name : " + subject.subjectName + ", Subject Hours : " + subject.subjectHours;
    }

    public void setAddress(String streetNO, String city, String country) {
        address.streetNO = streetNO;
        address.city = city;
        address.country = country;
    }

    public String getAddress() {
        return "Street NO : " + address.streetNO + ", City : " + address.city + ", Country : " + address.country;
    }

    public String studentDetails(){
        return  "Name : " + name + "\nID : " + studentID + "\nGPA : " + studentGPA +
                "\nSubject : " + getSubject() + "\nAddress : " + getAddress();
    }

}
