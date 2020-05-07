package Tasks_from_51_to_70;

public class Task_053 {
    public static void main(String[] args) {

        int k = 400;
        int number = 456;
        int f = (number % 10);
        int m = (number % 100) / 10;
        int l = (number % 1000) / 100;

        if (k < number){
            System.out.println((double)number / (f + m + l));
        }
        else
        {
            System.out.println((double)f / number);
        }
    }
}
