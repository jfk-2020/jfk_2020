package Homework_686_694;

public class Task_692 {
    public static void main(String[] args) {
        char[] char1 = {'4', '6', '0', '5', '1', '3', '0', '1'};
        char [] char2 = new char[char1.length];
        for (int i = 0 ; i < char1.length ; i++){
            char2[char1.length-1-i] = char1[i];
        }
        System.out.println(char2);
    }
}
