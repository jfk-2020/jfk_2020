package Save_files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputStream {


    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\spetrosyan\\Desktop\\javaprogram.txt");

        java.io.BufferedInputStream bis = new java.io.BufferedInputStream(fileInputStream, 200);

        int i;

        while ((i = bis.read()) != -1) {

            System.out.print((char) i);
        }


        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\spetrosyan\\Desktop\\javaprogram.txt"))) {
            reader.readLine();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
