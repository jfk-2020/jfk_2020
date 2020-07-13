package com.jfk.generics;

public class LiteralGeneric<S extends CharSequence> {

    private S line;


    public LiteralGeneric(S line) {
        this.line = line;
    }
}
