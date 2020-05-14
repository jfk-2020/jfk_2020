package Tasks_from_201_to_210;

public class Task_207 {
    public static void main(String[] args) {

        int n = 44334;
        int a = 0;
        boolean t = false;

        while (n != 0) {
            a = n % 10;
            n = n / 10;

            if (a == 2) {
                t = true;
                break;
            }
        }
        System.out.println(t);

    }
}
