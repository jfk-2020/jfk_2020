package com.jfk;

/**
 * @author William Arustamyan
 */

public class MathSum {


    public static void main(String[] args) {
        String firstArgument = "454657321354765132465432143514341354121358";
        String secondArgument = "3213545632122365432143514341354121342";
        char[] result = summarizeBigNumbers(firstArgument, secondArgument);
        reverse(result);
        System.out.println(result);
    }

    static char[] summarizeBigNumbers(char[] first, char[] second) {
        if (first == null || second == null) return null;

        char[] result = new char[largestArray(first, second).length];
        int loopCount = getLoopCount(first, second);

        int firstIterator = first.length - 1;
        int secondIterator = second.length - 1;
        int rc = 0;
        boolean hasRest = false;
        for (int i = 0; i < loopCount; i++) {
            int number = (first[firstIterator] - 48) + (second[secondIterator] - 48);
            if (hasRest) {
                number = number + 1;
                hasRest = false;
            }
            if (number >= 10) {
                result[rc] = (char) ((number - 10) + 48);
                hasRest = true;
            } else {
                result[rc] = (char) (number + 48);
            }
            rc++;
            firstIterator--;
            secondIterator--;
        }
        char[] largeArray = largestArray(first, second);
        int currentPosition;
        if (first.length == largeArray.length) {
            currentPosition = firstIterator;
        } else {
            currentPosition = secondIterator;
        }
        for (int i = currentPosition; i >= 0; i--) {
            int number;
            if (hasRest) {
                number = (largeArray[i] - 48) + 1;
                hasRest = false;
            } else {
                number = (largeArray[i] - 48);
            }
            if (number >= 10) {
                result[rc] = (char) ((number - 10) + 48);
                hasRest = true;
            } else {
                result[rc] = (char) (number + 48);
            }
            rc++;
        }
        if (hasRest) {
            char[] tmp = new char[result.length + 1];
            copyArray(result, tmp);
            tmp[rc] = (char) 49;
            return tmp;
        }
        return result;
    }

    static void copyArray(char[] from, char[] to) {
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
    }

    static void reverse(char[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            char elem = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = elem;
        }
    }

    static char[] largestArray(char[] first, char[] second) {
        if (first.length > second.length) {
            return first;
        }
        return second;
    }

    static int getLoopCount(char[] first, char[] second) {
        if (first.length > second.length) {
            return second.length;
        }
        return first.length;
    }

    //Overloading
    static char[] summarizeBigNumbers(String first, String second) {
        return summarizeBigNumbers(first.toCharArray(), second.toCharArray());
    }
}
