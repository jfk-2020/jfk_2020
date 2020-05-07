package Tasks_from_51_to_70;

public class Task_066 {
    public static void main(String[] args) {
        int number = 6644;
        int f =  number % 10;
        int m = (number / 10) % 10;
        int m1 = (number / 100) % 10;
        int l = number / 1000;
        String result = "NO";

        if (f == 4 && l == 4)
            result = "YES";
        System.out.println(result);
    }
}
