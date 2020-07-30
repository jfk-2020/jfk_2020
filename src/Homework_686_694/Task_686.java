package Homework_686_694;
public class Task_686 {
    public static void main(String[] args) {
    int n = 3;
    char[] char1 = {'c', 'd', 'x', 'd', 'c', 'a', 'c', 'c'};
    char[] char2 = new char[char1.length * (n + 1)];
    int k = 0;
    int l=1;
    for (int i = 0; i < char1.length; i++) {

        char2[i+k] = char1[i];
        for (int f = 0; f < 3; f++) {
            char2[i+k+1] = ',';
            k++;


        }
    }
    System.out.println(char2);
}
}
