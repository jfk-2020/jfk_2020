package com.jfk.generics;

import java.io.InputStream;

public class ResourceNetworkReader implements ResourceReader {
    @Override
    public String read(InputStream stream) {
        System.out.println("Reading resource");
        return null;
    }
}
