package Tasks_from_151_to_191;

public class Task_164 {
    public static void main(String[] args) {
       int n = 100;
        int a = 30;
        double b;

        while (n <= 999) {
            b = Math.sqrt (n);

            if (b > a){
                System.out.println(n);
                break;
            }
            n++;
        }
//        int n = 13;
//        for (int i = 100; i <= 999; i++) {
//
//            double sr = Math.sqrt(i);
//            if (sr > n) {
//                System.out.println(i);
//                break;
//            }
//        }
    }
}
