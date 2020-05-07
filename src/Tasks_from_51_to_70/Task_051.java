package Tasks_from_51_to_70;

public class Task_051 {
    public static void main(String[] args) {

        int number = 156;
        int f = (number % 10);
        int m = (number % 100) / 10;
        int l = (number % 1000) / 100;

        //boolean t = (f == m + l);
        System.out.println(l);
    }
}
