package Homework_646_660;

public class Task_652 {
    public static void main(String[] args) {
        int n = 8;
        char[] char1 = {'a', 'z', 'j', 'k', 'l', 'l', 'p', 'z'};

        char[]char3 = new char[n];
        for (int i = 0; i< char1.length ; i++){
            char[] char2 = {'l', 'k', 'f', 'Y', 'p', 'h', 'o', 'i'};
            for (int k = 0 ; k < char2.length; k++ ){
                if (char1 [i] == char2[k]){char3[i] = char1[i];}
            }
        }
        System.out.println(char3);
    }
}
