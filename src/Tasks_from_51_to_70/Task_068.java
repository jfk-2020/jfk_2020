package Tasks_from_51_to_70;

public class Task_068 {
    public static void main(String[] args) {

        int number = 9998;
        int f =  number % 10;
        int m = (number / 10) % 10;
        int m1 = (number / 100) % 10;
        int l = number / 1000;

        if (f > m) {
            System.out.println((double) f * m1);
        } else {
            System.out.println("1");
        }
    }
}
