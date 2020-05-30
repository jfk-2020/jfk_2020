package Homework_686_694;

public class Task_688 {
    public static void main(String[] args) {
    char[] char1 = {'A', '6', 'x', '5', '1', 'P', 'c', 'Z'};
    int count = 0;
    for (int i = 0; i< char1.length;i++){
        if (char1[i] >=65 && char1[i]<=90){count++;}
    }
    System.out.println(count);
}
}
