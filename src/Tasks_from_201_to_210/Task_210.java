package Tasks_from_201_to_210;

public class Task_210 {
    public static void main(String[] args) {

        int n = 4354;
        int k = 0;
        int z = 0;


        while (n != 0) {
            int g = n % 10;
            if (g % 2 != 0) {
                k = k + g;
                n = n / 10;
            } else if (g % 2 == 0) {
                z = z + g;
                n = n / 10;
            }
        }
        System.out.println(k == z);
    }
}