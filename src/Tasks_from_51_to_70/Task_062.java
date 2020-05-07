package Tasks_from_51_to_70;

public class Task_062 {
    public static void main(String[] args) {

        int number = 2646;
        int f = (number % 10);
        int m = (number % 100) / 10;
        int m1 = (number % 1000) / 100;
        int l = (number % 10000) / 1000;

        if (f + m1 == 0){
            System.out.println("FALSE");
        }
        if (number < 5000) {
            System.out.println((double) number / (f + m1));
        } else {
            System.out.println((double) number / (m + l));
        }
    }
}
