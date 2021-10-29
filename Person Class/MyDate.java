package com.company;

import java.util.GregorianCalendar;

public class MyDate {
    private int day;
    private int month;
    private int year;
    GregorianCalendar calendar;

    public MyDate() {
        calendar = new GregorianCalendar();
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        month = calendar.get(GregorianCalendar.MONTH) + 1;
        year = calendar.get(GregorianCalendar.YEAR);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDate(){
        return "Day : " + day + ", Month : " + month + ", Year : " + year;
    }
}
