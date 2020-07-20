package com.jfk.lesson10;

public class ExpressionDeduction {
    public static void main(String[] args) {
        String add1 = "7867451459241891984";
        String add2 = "541628426516";
        char[] addc1 = add1.toCharArray();
        char[] addc2 = add2.toCharArray();
        int maxLength = Math.max(addc1.length, addc2.length);
        char[] answer = execute(addc1, addc2);
        for (int i = 0; i < maxLength - addc1.length + 3; i++) {
            System.out.print(" ");
        }
        System.out.println(addc1);
        System.out.println("-");
        for (int i = 0; i < maxLength - addc2.length + 3; i++) {
            System.out.print(" ");
        }
        System.out.println(addc2);
        System.out.println("=");
        for (int i = 0; i < maxLength + 3; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.print("  ");
        System.out.println(answer);
    }
    static char[] execute(char[] addc1, char[] addc2) {
        int maxLength = Math.max(addc1.length, addc2.length);
        char[] answer = new char[maxLength + 1];
        int c = 0;
        for (int i = 0; i < maxLength; i++){
            int a1 = 0;
            int a2 = 0;
            if (i < addc1.length) {
                a1 = (int)(addc1[addc1.length - 1 - i] - 48);
            }
            if (i < addc2.length) {
                a2 = (int)(addc2[addc2.length - 1- i] - 48);
            }
            int a = a1 + a2 + c;
            char c1 = '0';
            if (a >= 10) {
                c1 = (char) (a % 10 + 48);
                c = a / 10;
            } else {
                c1 = (char) (a + 48);
                c = 0;
            }
            answer[answer.length - 1 - i] = c1;
        }
        if (c > 0) {
            answer[0] = (char) (c + 48);
        }
        return answer;
    }
}
