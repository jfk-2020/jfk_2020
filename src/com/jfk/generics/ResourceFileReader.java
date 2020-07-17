package com.jfk.generics;

import java.io.InputStream;

public class ResourceFileReader implements ResourceReader {
    @Override
    public String read(InputStream stream) {
        System.out.println("Resource file reader");
        return null;
    }
}
