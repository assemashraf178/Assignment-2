package com.company;

public class Employee extends Person{
    private int office;
    private double salary;
    MyDate dateHired;

    public Employee(){}

    public Employee(int office, double salary) {
        this.office = office;
        this.salary = salary;
        dateHired = new MyDate();
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Class Name : Employee , Person's name : " + getName();
    }
}
