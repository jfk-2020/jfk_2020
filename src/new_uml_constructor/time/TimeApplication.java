package new_uml_constructor.time;

public class TimeApplication {
    public static void main(String[] args) {
        // Time time = new Time(3,34,56);
        Time time = ValidatableTime.createTime(11, 59, 59);
        System.out.println(time);
        time.nextSecond();
        for (int i = 0; i <60; i++) {
            for (int k = 0; k <60; k++) {
                time.nextSecond();
            }
            ;
        }

        System.out.println(time);
    }
}
