package Homework_686_694;

public class Task_693 {
    public static void main(String[] args) {
        char[] char1 = {'8', '6', '0', '5', '1', '3', '6', '1'};
        int sum = 0 ;
        for (int i=0 ; i< char1.length ; i++ ){
            sum = sum + (char1[i]-48);
        }
        System.out.println(sum);
    }
}
