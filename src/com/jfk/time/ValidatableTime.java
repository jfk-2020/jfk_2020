package com.jfk.time;

/**
 * @author William Arustamyan
 */

public class ValidatableTime {
    private static int hourStart = 0;
    private static int hourEnd = 12;

    private static int minStart = 0;
    private static int minEnd = 60;

    private static int secondStart = 0;
    private static int secondEnd = 60;


    public static Time createTime(int h, int m, int s) {
        if (isValidHour(h) && isValidMinute(m) && isValidSecond(s)) {
            return new Time(h, m, s);
        }
        System.out.println("invalid time parameter");
        return null;

    }

    private static boolean isValidHour(int h) {
        return h >= hourStart && h <= hourEnd;
    }

    private static boolean isValidMinute(int m) {
        return m >= minStart && m <= minEnd;
    }


    private static boolean isValidSecond(int s) {
        return s >= secondStart && s <= secondEnd;
    }
}
