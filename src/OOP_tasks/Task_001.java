package OOP_tasks;

public class Task_001 {
    public static void main(String[] args) {


        System.out.println(sumOfIntegers(4));
    }
    static int sumOfIntegers(int n) {
        if (n == -2) {
            return 0;
        }
        return n + sumOfIntegers(n - 1);
    }
}
