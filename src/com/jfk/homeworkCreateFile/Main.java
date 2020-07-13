package com.jfk.homeworkCreateFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        FileHelper fileHelper = new FileHelper();

        try{
            fileHelper.createFile("newFile", "txt");
            fileHelper.writeInFile("New file");
            System.out.println("This is the text in the file: " + fileHelper.readFile());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
