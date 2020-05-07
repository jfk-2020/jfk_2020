package Tasks_from_51_to_70;

public class Task_061 {
    public static void main(String[] args) {
        int number = 2644;
        int f = (number % 10);
        int m = (number % 100) / 10;
        int m1 = (number % 1000) / 100;
        int l = (number % 10000) / 1000;

        boolean t = (f + m) == (m1 + l);

        System.out.println(t);


    }
}
