package Homework_686_694;

public class Task_690 {
    public static void main(String[] args) {
        char[] char1 = {'a', '6', 'x', '5', '1', 'P', 'c', 'Z'};
        int count = 0;
        for (int i = 0; i< char1.length;i++){
            if (char1[i] >=97 && char1[i]<=122){char1[i]-=32;}
            else { if (char1[i] >=65 && char1[i]<=90){char1[i]+=32;}}
        }
        System.out.println(char1);
    }
}
