package Tasks_from_51_to_70;

public class Task_052 {
    public static void main(String[] args) {

        int number = 161;
        int f = (number % 10);
        int m = (number % 100) / 10;
        int l = (number % 1000) / 100;

        boolean t = (f == m || f == l || m == l);

        System.out.println(t);
    }
}
