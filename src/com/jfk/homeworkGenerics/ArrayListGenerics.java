package com.jfk.homeworkGenerics;


public class ArrayListGenerics<T> {
    private T[] newArray;

    public ArrayListGenerics(int size) {
        this.newArray = (T[]) new Object[size];
    }

    public ArrayListGenerics() {
        this(10);
    }

    public T getByIndex(int index) {
        return this.newArray[index];
    }

}
