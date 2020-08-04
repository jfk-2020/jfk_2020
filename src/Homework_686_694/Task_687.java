package Homework_686_694;

public class Task_687 {
    public static void main(String[] args) {
        char[] char1 = {'c', '6', 'x', '5', '1', '0', 'c', '9'};
        int count = 0;
        for (int i = 0; i< char1.length;i++){
            if (char1[i] >=48 && char1[i]<=57){count++;}
        }
        System.out.println(count);
    }
}
