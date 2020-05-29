package Homework_646_660;

public class Task_658 {
    public static void main(String[] args) {
        int n = 8;
        char[] char1 = {'l', 'x', 'j', 'k', 'x', 'a', 'k', 'o'};
        char[] char2 = new char[char1.length];
        char x = 0;
        for (int i = 0; i < char1.length; i+=2) {
      char2[i]=char1[i+1];
      char2[i+1]=char1[i];
        }
        System.out.println(char2);
    }
}
