package new_uml_constructor.time;

import new_uml_constructor.time.Time;

public class ValidatableTime {

    private static int hourStart = 0;
    private static int hourEnd = 12;

    private static int minStart = 0;
    private static int minEnd = 60;

    private static int secondStart = 0;
    private static int secondEnd = 60;

    public static Time createTime(int h, int m, int s){
        if (isvalidHour(h)&&isvalidMinute(m)&&isvalidSecond(s)){
            return new Time(h, m, s);
        }
        System.out.println("invalid time parameters");
        return null;
    }


    public static boolean isvalidHour(int h){
        return h >=hourStart && h <=hourEnd;
    }
    public static boolean isvalidMinute (int m){
        return m >=minStart && m <=minEnd;
    }
    public static boolean isvalidSecond(int s){
        return s >=secondStart && s <=secondEnd;
    }



}
