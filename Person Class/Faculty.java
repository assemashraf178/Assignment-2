package com.company;

public class Faculty extends Employee{
    private int officeHours;
    private int rank;

    public Faculty(){}

    public Faculty(int officeHours, int rank) {
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class Name : Faculty , Person's name : " + getName();
    }
}
