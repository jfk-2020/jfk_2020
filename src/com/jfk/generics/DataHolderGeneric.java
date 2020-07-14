package com.jfk.generics;

public class DataHolderGeneric<T> {

    private T value;

    public DataHolderGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
