package com.jfk.lesson14UML;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) throws NoInputValidationNeeded{
        if (hour < 0 || hour > 23) {
            throw new NoInputValidationNeeded();
        }
        if (minute < 0 || minute > 59) {
            throw new NoInputValidationNeeded();
        }
        if (second < 0 || second > 59) {
            throw new NoInputValidationNeeded();
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) throws NoInputValidationNeeded{
        if (hour < 0 || hour > 23) {
            throw new NoInputValidationNeeded();
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) throws NoInputValidationNeeded{
        if (minute < 0 || minute > 59) {
            throw new NoInputValidationNeeded();
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) throws NoInputValidationNeeded{
        if (second < 0 || second > 59) {
            throw new NoInputValidationNeeded();
        }
        this.second = second;
    }
    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public Time nextSecond() throws NoInputValidationNeeded{
        if (second < 59) {
            return new Time(hour, minute, second + 1);
        } else if (minute < 59) {
            return new Time(hour, minute + 1, 0);
        } else if (hour < 23) {
            return new Time(hour + 1, 0, 0);
        }
        return new Time(0, 0, 0);
    }
    public Time previousSecond() throws NoInputValidationNeeded{
        if (second > 0) {
            return new Time(hour, minute, second - 1);
        } else if (minute > 0) {
            return new Time(hour, minute - 1, 59);
        } else if (hour > 0) {
            return new Time(hour - 1, 59, 59);
        }
        return new Time(23, 59, 59);
    }

    public static void main(String[] args) throws NoInputValidationNeeded{
        Time time = new Time(0, 0, 0);
        System.out.println(time);
        for (int i = 0; i < 100; i++){
            time = time.previousSecond();
            System.out.println(time);
        }
        for (int i = 0; i < 102; i++) {
            time = time.nextSecond();
            System.out.println(time);
        }
    }
}
