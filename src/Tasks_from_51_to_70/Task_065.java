package Tasks_from_51_to_70;

public class Task_065 {
    public static void main(String[] args) {
        int number = 2643;
        int f =  number % 10;
        int m = (number / 10) % 10;
        int m1 = (number / 100) % 10;
        int l = number / 1000;
        String result = "y = 0";

        if (f * m == 12)
            result = "y = 12";
        System.out.println(result);
    }
}
