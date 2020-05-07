package Tasks_from_51_to_70;

public class Task_070 {
    public static void main(String[] args) {

        int number = 1234;
        int f =  number % 10;
        int m = (number / 10) % 10;
        int m1 = (number / 100) % 10;
        int l = number / 1000;
        int y = 0;

        if (f * m * m1 * l < 200)
            y = 1;
        System.out.println(y);

    }
}
