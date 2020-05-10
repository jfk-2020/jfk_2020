package Tasks_from_151_to_191;

public class Task_152 {
    public static void main(String[] args) {

        int n = 11;
        int d = 1;

        for (int i = n; i < 25; i ++) {
            if (i % n == 0) {
                d = d * i;
            }
        }
        System.out.println(d);
    }
}
