package Recursion;

public class Task_1 {
    public static void main(String[] args) {
        int n = 10;
        int summ = 0;
        int sum = getSummary(n, summ);
        System.out.println(sum);
    }

    public static int getSummary(int count, int summary) {
        if (count == 0) {
            return summary;
        } else {
            summary = summary + count;
            count--;
        }
        return getSummary(count, summary);
    }

}


