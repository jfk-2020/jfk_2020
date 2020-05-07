package Tasks_from_51_to_70;

public class Task_063 {
    public static void main(String[] args) {
        int number = 2606;
        int f = (number % 10);
        int m = (number % 100) / 10;
        int m1 = (number % 1000) / 100;
        int l = (number % 10000) / 1000;
        int y = 0;

        if (f == 1 || m == 1 || m1 == 1 || l == 1)
        y = 1;

            System.out.println(y);
    }
}
