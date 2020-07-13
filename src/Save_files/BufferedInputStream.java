package Save_files;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedInputStream {


    public static void main(String[] args) throws IOException {
        String fileName = "test_file.txt";
        FileWriter writer = new FileWriter(fileName, true);
        for (int k = 0; k < 100000; k++) {
            writer.append(String.format("line number : %d", k)).append("\n");
        }
        writer.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int i;
        while ((i = fileInputStream.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
