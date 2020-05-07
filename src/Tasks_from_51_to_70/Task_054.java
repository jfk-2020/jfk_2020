package Tasks_from_51_to_70;

public class Task_054 {
    public static void main(String[] args) {
        int number = 876;
        int f = (number % 10);
        int m = (number % 100) / 10;
        int l = (number % 1000) / 100;

        if (f > m && m > l) {
            System.out.println(f);
        } else if (m > f && f > l){
            System.out.println(m);
        } else {
            System.out.println(l);
        }
    }
}
