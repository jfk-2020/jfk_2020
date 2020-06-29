package enumeration;


public enum Seasons {

    SPRING(1, new Month[]{Month.April, Month.March, Month.May}),
    SUMMER(2, new Month[]{Month.June, Month.July, Month.August}),
    AUTUMN(3, new Month[]{Month.September, Month.October, Month.November}),
    WINTER(4, new Month[]{Month.December, Month.January, Month.February});

    private int number;
    private Month[] months;

    Seasons(int number, Month[] months) {
        this.number = number;
        this.months = months;
    }

    public int getNumber() {
        return number;
    }

    public Month[] getMonths() {
        return this.months;
    }

    public static Seasons findSeason(Month month) {
        for (int i = 0; i < Seasons.values().length; i++) {
            for (int k = 0; k < Seasons.values()[i].months.length; k++) {
                if (Seasons.values()[i].months[k] == month) {
                    return Seasons.values()[i];
                }
            }
        }
        return null;
    }

    public static Seasons findByMonthsCount(int count) {
        for (int i = 0; i < Seasons.values().length; i++) {
            if (Seasons.values()[i].number == count) {
                return Seasons.values()[i];
            }
        }
        return null;
    }

}
