package Homework_201_210;

public class Task_206 {
    public static void main(String[] args) {

        int n = 25577;
        double tiv = 0;
        double tvanshanneriQanak = 0;
        for (int j = 1; j <= n; j = j * 10) {
            tvanshanneriQanak = tvanshanneriQanak + 1;
        }
        for (int i = n; i != 0; i /= 10) {
            tiv = tiv + i % 10 * Math.pow(10, tvanshanneriQanak - 1);
            tvanshanneriQanak = tvanshanneriQanak - 1;
        }
        System.out.println(tiv);

    }
}

