package Tasks_from_151_to_191;

public class Task_163 {
    public static void main(String[] args) {

        int a;
        double b;
        int n = 10000;
        boolean result = false;

        while (n > 1000) {
            a = (int) Math.sqrt(n * 18);
            b = Math.sqrt(n * 18);
            if (a == b) {
                result = true;
                System.out.println((int) n);
                break;
            }
            n--;
        }
            if (result == false)
                System.out.println("AYDPISI TIV CHKA!!!");
    }
}
