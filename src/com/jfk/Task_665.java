package com.jfk;

/**
 * @author William Arustamyan
 */

public class Task_665 {

    public static void main(String[] args) {
        int n = 11;
        int m = 10;
        char[] nArray = ArrayElementGenerator.generateCharArray(2 * n);
        char[] mArray = ArrayElementGenerator.generateCharArray(m);
        char[] merged = new char[nArray.length + mArray.length];

        for (int i = 0; i < nArray.length / 2; i++) {
            merged[i] = nArray[i];
        }

        for (int i = 0; i < mArray.length; i++) {
            merged[nArray.length / 2 + i] = mArray[i];
        }
        for (int i = nArray.length / 2; i < nArray.length; i++) {
            merged[i + mArray.length] = nArray[i];
        }

        char[] description = {'e', 's', ' ', 'u', 'z', 'u', 'm', ' ', 'e', 'm', ',', ' ', 'n', 'a'};

        String dsc = "es uzum em naxadasutyun stanam, bayc, vor mejy, bayc lini";
        String expression = "4*(4+6)-3(3-2)";
        char[] expChars = expression.toCharArray();
        int f = '9' - 48;
        System.out.println(f);
        char[] chars = dsc.toCharArray();


        System.out.println(chars);
        System.out.println(nArray);
        System.out.println(mArray);
        System.out.println(merged);

        //646-660, 686-694
        //Artacel artahayutyan arjeqy 4*(4+6)-3*(3-2)
        //gtnel toxum amenashaty krknvor bary ev artacel te qani angam e krknvum

        //stanal 2 toxeri gumary
        String str1 = "454654321354765132465432143514341354121358";
        String str2 = "3213545632122365432143514341354121354";
        char[] charStr1 = str1.toCharArray();

    }
}
