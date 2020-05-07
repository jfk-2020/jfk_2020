package Tasks_from_51_to_70;

public class Task_069 {
    public static void main(String[] args) {

        int number = 9178;
        int f =  number % 10;
        int m = (number / 10) % 10;
        int m1 = (number / 100) % 10;
        int l = number / 1000;
        int y = 1;

        if (f + m + m1+ l < 20)
            y = 0;
        System.out.println(y);

    }
}
