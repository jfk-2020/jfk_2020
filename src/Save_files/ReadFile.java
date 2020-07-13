package Save_files;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\spetrosyan\\Desktop\\javaprogram.txt");

        int i;

        while ((i = fileInputStream.read()) != -1) {

            System.out.print((char) i);
        }
    }
}
