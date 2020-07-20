package com.jfk.lesson23Generics;

public class ArrayListOwn <T> {
    private int size = 0;
    private Object[] array = new Object[1000];
    public void add(Object a) {
        if (size >= 1000) {
            throw new ArrayIndexOutOfBoundsException();
        }
        array[size++] = a;
    }
    public T get(int index) {
        if (index >= size) {
            throw new NullPointerException();
        } else {
            return (T) array[size - 1];
        }
    }

    public static void main(String[] args) {
        ArrayListOwn<String> arrayListOwn = new ArrayListOwn<>();
        arrayListOwn.add("Hello");
        arrayListOwn.add("Hi");
        arrayListOwn.add("Barev");
        System.out.println(arrayListOwn.get(2));
    }
}
