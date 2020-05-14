package Tasks_from_201_to_210;

public class Task_209 {
    public static void main(String[] args) {

        int n = 4429;
        int k = n % 10;
        boolean result = false;

        while (n != 0){
            if (k % 2 != 0)
                result = true;
            n = n / 10;
            break;
        }
        System.out.println(result);
    }
}
