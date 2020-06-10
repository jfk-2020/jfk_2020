package OOP_tasks;

public class Task_002 {
    public static void main(String[] args) {


//        System.out.println(maxElement(new int[]{8, 43, 23, 1, 56}, 0, 0));
//    }
//
//    static int maxElement(int[] arr, int n, int max) {        //mecaguyn arzheq
//        if (n < arr.length) {
//            if (max < arr[n])
//                max = arr[n];
//            return maxElement(arr, n + 1, max);
//        }
//        return max;

        int a[] = {1, 4, 45, 6, -50, 10, 2};
        int n = a.length;

        System.out.println(findMinRec(a, n));
    }

    static int findMinRec(int a[], int n) {
        if (n == 1) {
            return a[0];
        }
        return Math.min(a[n - 1], findMinRec(a, n - 1));
    }
}
