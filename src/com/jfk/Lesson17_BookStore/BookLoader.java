package com.jfk.Lesson17_BookStore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BookLoader {
    private String dir;
    private String fileName;
    public BookLoader(String dir, String fileName) {
        this.dir = dir;
        this.fileName = fileName;
    }
    public void booksSave() {
        try {
            FileWriter fileWriter = new FileWriter(dir + fileName);
            fileWriter.write("Books");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void booksLoad() {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(dir + fileName));
            String text = fileReader.readLine();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
