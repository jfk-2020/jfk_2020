package Class_Functionals.Classes_UML.Time;

public class test_Time {
    public static void main(String[] args) {

        Time time = new Time(2, 4, 23);
        System.out.println(time);

        time.setTime(1, 5, 3);
        System.out.println(time);

        time = time.nexSecond();
        System.out.println(time);
        time = time.previousSecond();
        System.out.println(time);
    }
}
