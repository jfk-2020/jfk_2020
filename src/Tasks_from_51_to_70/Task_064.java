package Tasks_from_51_to_70;

public class Task_064 {
    public static void main(String[] args) {
        int number = 2641;
        int f = (number % 10); // number % 10
        int m = (number % 100) / 10; // (number / 10) % 10
        int m1 = (number % 1000) / 100; // (number / 100) % 10
        int l = (number % 10000) / 1000; // number / 1000
        char y = 'd';

                if (f + m == 5)
                    y = 's';
        System.out.println(y);

    }
}
