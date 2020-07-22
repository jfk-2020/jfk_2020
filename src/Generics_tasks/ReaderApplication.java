package Generics_tasks;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReaderApplication {
    public static void main(String[] args) throws FileNotFoundException {

        ResourceReader fileReader = new ResourceFileReader();
        ResourceReader networkReader = new ResourceNetworkReader();
        ResourceUpdateProcessor<ResourceReader> updateProcessor = new ResourceUpdateProcessor<>();
        updateProcessor.doUpdateResource(networkReader, new BufferedInputStream(new FileInputStream("ddd")));

    }
}
