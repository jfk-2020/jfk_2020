package new_uml_constructor.time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }
    public Time nextSecond(){
        this.second = second +1;
        if (this.second == 60){
            if (this.minute +1==60){
                if (++this.hour==12){
                    this.hour = 0;
                    this.minute = 0;
                    this.second = 0;
                    }else {
                    this.second=0;
                    this.minute=0;

                }
            }else {this.second = 0;
                    this.minute++;
            }
        }
        return this;
    }
    public Time previousSecond (){
        this.second = second -1;
        return this;
    }
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    @Override
    public String toString() {
        String sHour = "";
        String sMin = "";
        String sSec = "";

        if (this.hour < 10){
            sHour = "0" + this.hour;
        }else {
            sHour += this.hour;
        }
        if (this.minute < 10){
            sMin = "0" + this.minute;
        }else {
            sMin += this.minute;
        }
        if (this.second < 10){
            sSec = "0" + this.second;
        }else {
            sSec += this.second;
        }

        return sHour + ":" + sMin + ":" + sSec;
    }

}
