package Tasks_from_151_to_191;

public class Task_151 {
    public static void main(String[] args) {

        int n = 15;
        int sum = 0;

       for (int i = n; i <= 90; i ++) {
            if (i % n == 0) {
                sum = sum +i;

           }
           //System.out.println(i);
       }
        System.out.println(sum);
    }

}
