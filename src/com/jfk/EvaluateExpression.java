package com.jfk;

/**
 * @author William Arustamyan
 */

public class EvaluateExpression {


    public static void main(String[] args) {
        String exp = "33*(32*432)+(3-1)";
        char[] expArray = exp.toCharArray();


//        while (isExpressionContainsMathSymbol(expArray)) {
        for (int i = 0; i < expArray.length; i++) {
            int openBracketIndex = indexOfSymbol(expArray, 0, '(');
            if (openBracketIndex != -1) {
                int closeBracketIndex = indexOfSymbol(expArray, openBracketIndex, ')');
                char[] brExp = slice(expArray, openBracketIndex, closeBracketIndex);
                evaluateExpression(brExp);
            }
        }
//        }
    }


    static char[] evaluateExpression(char[] exp) {
        for (int i = 0; i < exp.length; i++) {
            int mulIndex = indexOfSymbol(exp, 0, '*');
            if (mulIndex != -1) {
                char[] leftExp = slice(exp, -1, mulIndex - 1);
                char[] rightExp = slice(exp, mulIndex, exp.length - 2);

                System.out.println(toInteger(leftExp));
            }
            int divIndex = indexOfSymbol(exp, 0, '/');
            if (divIndex != -1) {
                char[] leftExp = slice(exp, -1, divIndex - 1);
                char[] rightExp = slice(exp, divIndex, exp.length - 2);
                int leftInt = toInteger(leftExp);
                int rightInt = toInteger(rightExp);
                int r = leftInt / rightInt;
                return toCharArray(r);
            }
        }
        return null;
    }

    static char[] toCharArray(int number) {

        while (number%10 != 0) {

        }
        return null;
    }
    static int toInteger(char[] array) {
        int integer = 0;
        int multiplicationPower = (int) Math.pow(10, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            integer = integer + (array[i] - 48) * multiplicationPower;
            multiplicationPower = multiplicationPower / 10;
        }
        return integer;
    }

    static int indexOfSymbol(char[] array, int fromIndex, char symbol) {
        for (int i = fromIndex; i < array.length; i++) {
            if (array[i] == symbol) {
                return i;
            }
        }
        return -1;
    }

    static char[] slice(char[] array, int from, int to) {
        char[] result = new char[to - from];
        int c = 0;
        for (int i = from + 1; i <= to; i++) {
            result[c++] = array[i];
        }
        return result;
    }

    static int[] indexesOfSymbol(char[] array, char symbol) {
        int[] indexes = new int[array.length];
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            int index = indexOfSymbol(array, i, symbol);
            if (index != -1) {
                indexes[c] = index;
                c++;
                i = index;
            }
        }
        if (c != 0) {
            int[] retArray = new int[c];
            for (int i = 0; i < c; i++) {
                retArray[i] = indexes[i];
            }
            return retArray;
        }
        return null;
    }

    static boolean isExpressionContainsMathSymbol(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '(' || array[i] == '+' || array[i] == '-' || array[i] == '*' || array[i] == '/') {
                return true;
            }
        }
        return false;
    }

}
