package Homework_201_210;

public class Task_205 {
    public static void main(String[] args) {

        int n = 212554;
        int l = 0;
        for (int k = 1; k <= n; k *= 10) {
            l = l + 1;
        }
        int t = 1;
        for (int f = 0; f < l - 1; f++) {
            t = t * 10;
        }
        int m = 1;
        for (int i = t; i >= 1; i /= 10) {
            m = n / i % 10;
            System.out.println(m);
        }
    }
}

