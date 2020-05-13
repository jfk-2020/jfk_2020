package Tasks_from_151_to_191;

public class Task_166 {
    public static void main(String[] args) {
        int n = 66;
        int d = 1;
        int y = 0;
        do {
            d *= 4;
            // System.out.println(x);
            if (n == d) {
                y = 1;
            } else {
                y = 0;
            }
        }while (n > d);
        System.out.println("n = " + n + "; y = " + y);


        /*int y = 0;
        int n = 64;

        for (int i = 0; i < n; i++)
            if (Math.pow(4, i) == n){
                y = 1;
                break;
            }
        System.out.println(y);*/
    }
}
