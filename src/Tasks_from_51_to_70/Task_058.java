package Tasks_from_51_to_70;

public class Task_058 {
    public static void main(String[] args) {

        char f = 'b';
        int number = 316;
        int d = (number % 10);
        int m = (number % 100) / 10;
        int l = (number % 1000) / 100;

        if (m + l > 5){
            f = 'a';
        }
            System.out.println(f);

    }
}
