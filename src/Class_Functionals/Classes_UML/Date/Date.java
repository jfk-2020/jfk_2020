package Class_Functionals.Classes_UML.Date;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        if (day < 1 || day > 31) {
            return -1;
        }
        return day;
    }

    public int getMonth() {
        if (month < 1 || month > 12) {
            return -1;
        }
        return month;
    }

    public int getYear() {
        if (year < 1900 || year > 9999) {
            return -1;
        }
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        if ((getMonth() >= 1 && getMonth() < 10) && (getDay() >= 1 && getDay() < 10)) {
            return "0" + getDay() + "/0" + getMonth() + "/" + getYear();
        }
        if ((getMonth() >= 1 && getMonth() < 10) && (getDay() >= 10 && getDay() <= 31)) {
            return getDay() + "/0" + getMonth() + "/" + getYear();
        }
        if ((getMonth() >= 10 && getMonth() <= 12) && (getDay() >= 1 && getDay() < 10)) {
            return "0" + getDay() + "/" + getMonth() + "/" + getYear();
        }
        return getDay() + "/" + getMonth() + "/" + getYear();
    }

//    String Day = "", Month = "";
//        if (day < 10)
//    Day += ("0" + day);
//        else
//    Day += day;
//        if (month < 10)
//    Month += ("0" + month);
//        else Month += month;
//
//        return Day + "/" + Month + "/" + year;


    public static Date getInstance(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1900 || year > 9999) {
            return null;
        }
        return new Date(day, month, year);
    }
}
