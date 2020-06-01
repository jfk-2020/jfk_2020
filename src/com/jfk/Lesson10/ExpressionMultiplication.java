package com.jfk.Lesson10;

public class ExpressionMultiplication {
    public static void main(String[] args) {
        String add1 = "1246549846516843";//""7867451459241891984";
        String add2 = "7984654132134";//""541628426516";
        char[] addc1 = add1.toCharArray();
        char[] addc2 = add2.toCharArray();
        int maxLength = Math.max(addc1.length, addc2.length);
        char[] answer = new char[addc1.length];// = executeAdd(addc1, addc2);
        for (int i = 0; i < addc1.length; i++) {
            answer[i] = '0';
        }
        for (int i = 0; i < addc2.length; i++) {
            int c = (int)(addc2[addc2.length - 1 - i] - 48);
            char[] new1 = addingZero(addc1, i);
            for (int j = 0; j < c; j++) {
                answer = executeAdd(answer, new1);
                answer = addingZeroAtFirst(answer);
                //System.out.println(answer);
            }
        }

        for (int i = 0; i < maxLength - addc1.length + 3; i++) {
            System.out.print(" ");
        }
        System.out.println(addc1);
        System.out.println("*");
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
        boolean isFirstNumber = false;
        for (int i = 0; i < answer.length; i++) {
            if (isFirstNumber) {
                System.out.print(answer[i]);
            }
            if (answer[i] != '0' && !isFirstNumber) {
                isFirstNumber = true;
                System.out.print(answer[i]);
            }
        }
        System.out.println();
    }
    static char[] executeAdd(char[] addc1, char[] addc2) {
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
    static char[] addingZero(char[] c, int count) {
        char[] result = new char[c.length + count];
        for (int i = 0; i < c.length; i++) {
            result[i] = c[i];
        }
        for (int i = 0; i < count; i++) {
            result[c.length + i] = '0';
        }
        return result;
    }
    static char[] addingZeroAtFirst(char[] c) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '\u0000') {
                c[i] = '0';
            }
        }
        return c;
    }
}
