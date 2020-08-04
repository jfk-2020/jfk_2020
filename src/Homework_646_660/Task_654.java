package Homework_646_660;

public class Task_654 {
    public static void main(String[] args) {
        int n = 8;
        char[] char1 = {'l', 'a', 'j', 'k', 'j', 'a', 'p', 'z'};
        char[] char2 = new char[n];
        for (int i =0; i< char1.length; i++){{
        if (char1[i]=='a'){continue;} else{char2[i]=char1[i];}
        }
        }
        System.out.println(char2);
    }
}
