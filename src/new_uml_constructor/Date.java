package new_uml_constructor;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day , int month , int year){
        this.day = day;
        this.month = month;
        this.year = year;
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

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day , int month , int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString (){
        return "dd/mm/yy";
    }
    public static Date getInstance(int day ,int month , int year){
        if (day > 30 && day <1 && month > 12 && month < 1 && year <1900 && year > 9999){
return null;
        }
        return new Date(day , month ,year );
    }
    public int day (){return day; }
    public int month (){return month; }
    public int year (){return year; }
}
