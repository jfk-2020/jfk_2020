package Recursion;

public class Task_3 {
    public static void main(String[] args) {
        int[] ints = {3, 8, 7, 5, -4, -2, 7};
        int summary = getelementsummary(ints,0,0);
        System.out.println(summary);
    }

    public static int getelementsummary(int[] array, int sum, int index) {
        if (array.length == index) {
            return sum;
        } else {
            sum = sum + array[index];
            index++;
            return getelementsummary(array, sum, index);
        }
    }
}
