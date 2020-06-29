package enumeration;

public enum  Seasons {

    SPRING (1 , "March , April , May") ,
    SUMMER (2,"june , July , August"),
    AUTUMN (3, "September , October , November"),
    WINTER (4,"December , January , February");

    private int count;
    private String monthName ;

    Seasons ( int count, String monthName ){
        this.count = count;
        this.monthName = monthName;
    }

    public int getCount() {
        return count;
    }

    public String getMonthName() {
        return monthName;
    }

    public static Seasons findByMonthsCount(int count){
        for (int i = 0; i < Seasons.values().length ; i++) {
            if (Seasons.values()[i].count == count){
                return Seasons.values()[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "count=" + count +
                ", monthName='" + monthName + '\'' +
                '}';
    }
}
