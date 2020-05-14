package Tasks_from_201_to_210;

public class Task_206 {
    public static void main(String[] args) {

        int n = 7235;
        int result = 0;

        while (n != 0) {

            result = result * 10 + n % 10;
            n = n / 10;
        }
        System.out.print(result);
    }
}
