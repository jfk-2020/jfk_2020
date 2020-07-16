package com.jfk.generics;

public class LiteralGenericArray<S extends CharSequence> {

    private S[] array;

    private LiteralGeneric<? extends CharSequence> literalGeneric;


    public LiteralGenericArray(S[] array, LiteralGeneric<? extends CharSequence> literalGeneric) {
        this.array = array;
        this.literalGeneric = literalGeneric;
    }

}
