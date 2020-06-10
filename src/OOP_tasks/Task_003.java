package OOP_tasks;

public class Task_003 {
    public static void main(String[] args) {

        int a[] = {1, 4, 45, 6, -50, 10, 2};
        int n = a.length;

        System.out.println(sumOfValues(a, n));
    }

    static int sumOfValues(int a[], int n) {
        if (n <= 0) {
            return 0;
        }
        return a[n - 1] + sumOfValues(a, n - 1);
    }
}
