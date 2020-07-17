package com.jfk.homeworkGenerics;


public class ArrayListGenerics<T> {
    private final Object[] newArray;

    public ArrayListGenerics(int size) {
        this.newArray = new Object[size];
    }

    public ArrayListGenerics() {
        this(10);
    }

    public T getByIndex(int index) {
        return (T) this.newArray[index];
    }

}
