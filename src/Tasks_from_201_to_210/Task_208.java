package Tasks_from_201_to_210;

public class Task_208 {
    public static void main(String[] args) {

        int n = 323;
        int a = n % 10;
        boolean result = true;

        while (n != 0){
            if (a != n % 10)
                result = false;
            n = n / 10;
        }
        System.out.println(result);
    }
}
