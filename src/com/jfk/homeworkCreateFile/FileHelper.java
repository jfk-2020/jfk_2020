package com.jfk.homeworkCreateFile;

import java.io.*;

public class FileHelper {

    private File file;

    //Create file
    public void createFile(String fileName, String extension) {
        file = new File("/Users/tatevmelikyan/" + fileName + "." + extension);
    }

    //Write in the file
    public void writeInFile(String description) throws IOException {
        FileOutputStream write = new FileOutputStream(file);
        write.write(description.getBytes());
    }

    //Read the file and display whatever is written in the file
    public String readFile() throws IOException {

        if (file == null) {
            throw new FileNotFoundException();
        } else {
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        }
    }
}


