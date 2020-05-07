package Tasks_from_51_to_70;

public class Task_057 {
    public static void main(String[] args) {

        int number = 249;
        int f = (number % 10);
        int m = (number % 100) / 10;
        int l = (number % 1000) / 100;

        if (f == 0){
            System.out.println(false);
        }
        if (number > 300){
            System.out.println((double) m / f);
        } else {
            System.out.println((double) l / f);
        }
    }
}
