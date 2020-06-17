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
        if (getDay() > 1 && getDay() < 10) {
            return "0" + getDay() + "/" + getMonth() + "/" + getYear();
        }
        return getDay() + "/" + getMonth() + "/" + getYear();
    }
}
