package com.jfk.Calculator;

import java.io.IOException;

public class CalcApplication {

    public static void main(String[] args) {

//        int x = 10;
//        int y = 30;
//
//        Calc calc = new IntegerNumberCalculator();
//
//        if (y != 0) {
//            double result = calc.execute(x, null, y);
//            System.out.println("RESULT : " + result);
//        }

        IntegerNumberCalculator m = new IntegerNumberCalculator();
        try{
            m.secondMethod();
        } catch (IOException ex) {
            System.out.println("FILE NOT FOUND");
        } finally {
            System.out.println("FINALLY");
        }

        // m.secondMethod();
        //System.out.println("CHEXAV");
        System.out.println("HASAV");


        //cay horstmann java read about exceptions from this book
        //Create and add UnknownBookTypeException extends from RuntimeException
        //Create and add BookStoreIsFullException extends from Exception
        //Create and add BookNotFoundException extends from Exception


    }
}
