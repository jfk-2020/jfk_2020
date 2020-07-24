package com.jfk.lesson23Generics;

import java.util.*;

public class ArrayListOwn <T> implements List<T>, Iterable<T> {
    private int size = 0;
    private Object[] array = new Object[10];
    List<Integer> l = new ArrayList<>();
    @Override
    public boolean add(T t) {
        if (size >= array.length) {
            Object[] arrayTemp = new Object[array.length + (int)(array.length * 0.25)];
            for (int i = 0; i < size; i++) {
                arrayTemp[i] = array[i];
            }
            array = arrayTemp;
        }
        array[size++] = t;
        return true;
    }

    @Override
    public T get(int index) {
        if (index >= size) {
            throw new NullPointerException();
        } else {
            return (T) array[size - 1];
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public boolean contains(Object o) {
        for (Object a: array) {
            if(a.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteratorImpl();
    }

    private class IteratorImpl implements Iterator<T> {
        int cursor;
        @Override
        public boolean hasNext() {
            return (cursor != size);
        }

        @Override
        public T next() {
            if (cursor >= size) {
                throw new NoSuchElementException();
            } else {
                return (T) array[cursor++];
            }
        }
    }
    @Override
    public Object[] toArray() {
        Object[] arraytemp = new Object[size];
        for (int i = 0; i < size; i++) {
            arraytemp[i] = array[i];
        }
        return arraytemp;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        if (contains(o)) {
            int sizeTemp = 0;
            Object[] arrayTemp = new Object[array.length];
            for (int i = 0; i < array.length; i++){
                if (array[i].equals(o)) {
                    continue;
                }
                arrayTemp[sizeTemp++] = array[i];
            }
            size = sizeTemp;
            array = arrayTemp;
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object a: c){
            if (!contains(a)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for (T a : c) {
            add(a);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        array = new Object[10];
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    public static void main(String[] args) {
        ArrayListOwn<String> arrayListOwn = new ArrayListOwn<>();
        arrayListOwn.add("Hello");
        arrayListOwn.add("Hi");
        arrayListOwn.add("Barev");
        System.out.println(arrayListOwn.get(2));
        for (String s : arrayListOwn){
            System.out.println(s);
        }
    }
}
