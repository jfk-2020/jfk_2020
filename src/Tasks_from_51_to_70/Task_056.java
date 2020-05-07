package Tasks_from_51_to_70;

public class Task_056 {
    public static void main(String[] args) {
        int number = 845;
        int f = (number % 10);
        int m = (number % 100) / 10;
        int l = (number % 1000) / 100;

        if(f > m){
            System.out.println((double) (f + m + l) / number);
        } else {
            System.out.println(number);
        }
    }
}
