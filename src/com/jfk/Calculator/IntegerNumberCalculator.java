package com.jfk.Calculator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IntegerNumberCalculator implements Calc {

    //throw
    //throws
    //try -> catch
    //finally


    @Override
    public double execute(int first, Operation operation, int second) {

        if (operation == null) {
            throw new InvalidOperationException("Operator is null");
        }
        if (operation == Operation.SUMMARY){
            return first + second;
        }
        if (operation == Operation.DIVIDE) {


            return first / second;
        }
        return first - second;
    }

    public void readFile() throws IOException {
        FileInputStream file = new FileInputStream("test");
    }
    public void secondMethod() throws IOException{
        readFile();
    }
}
