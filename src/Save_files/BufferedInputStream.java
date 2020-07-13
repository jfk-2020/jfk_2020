package Save_files;

import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream {

    public BufferedInputStream(FileInputStream fileInputStream, int i) {

    }

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\spetrosyan\\Desktop\\javaprogram.txt");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);

        int i;

        while((i = bufferedInputStream.read())!= -1){

            System.out.print((char)i);
        }
    }

    private char read() {
        return 0;
    }
}
