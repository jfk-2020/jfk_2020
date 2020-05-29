package Homework_646_660;

public class Task_655 {
    public static void main(String[] args) {
        int n = 4;
        char[] char1 = {'l', 'a', 'j', 'k', 'j', 'a', 'p'};
        char[] char2 = new char[2*n-1];
        char temp = 0;
        for (int i = 0 ; i < char1.length; i++){
           char2[char1.length-1-i]=char1[i];
        }
        System.out.println(char2);
    }
}
