package com.company;

public class Student extends Person{

    private int status;
    private final int FRESHMAN = 1;
    private final int SOPHOMORE = 2;
    private final int JUNIOR = 3;
    private final int SENIOR = 4;

    public Student(){}

    public Student(int status) {
        this.status = status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatus(){
        switch(status){
            case 1:
                return "Freshman";
            case 2:
                return "Sophomore";
            case 3:
                return "Junior";
            case 4:
                return "Senior";
            default:
                return "Not Valid Status";
        }
    }

    @Override
    public String toString() {
        return "Class Name : Student , Person's name : " + getName();
    }
}
