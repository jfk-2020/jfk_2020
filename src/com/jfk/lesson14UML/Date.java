package com.jfk.lesson14UML;

class NoInputValidationNeeded extends Exception{}

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) throws  NoInputValidationNeeded{
        if (day < 1 || day > 31) {
            throw new NoInputValidationNeeded();
        }
        if (month < 1 || month > 12) {
            throw new NoInputValidationNeeded();
        }
        if (year < 1900 || year > 9999) {
            throw new NoInputValidationNeeded();
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) throws NoInputValidationNeeded{
        if (day < 1 || day > 31) {
            throw new NoInputValidationNeeded();
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) throws NoInputValidationNeeded{
        if (month < 1 || month > 12) {
            throw new NoInputValidationNeeded();
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws NoInputValidationNeeded{
        if (year < 1900 || year > 9999) {
            throw new NoInputValidationNeeded();
        }
        this.year = year;
    }
    public void setDate(int day, int month, int year) throws NoInputValidationNeeded{
        if (day < 1 || day > 31) {
            throw new NoInputValidationNeeded();
        }
        if (month < 1 || month > 12) {
            throw new NoInputValidationNeeded();
        }
        if (year < 1900 || year > 9999) {
            throw new NoInputValidationNeeded();
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    public static void main(String[] args) throws NoInputValidationNeeded{
        Date d = new Date(2, 11, 1986);
        System.out.println(d);
    }
}
