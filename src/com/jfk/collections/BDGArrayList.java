package com.jfk.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class BDGArrayList<E> implements Collection<E> {

    private E data[];
    private static int size = 0;

    public BDGArrayList(int size) {
        this.data = (E[]) new Object[size];
    }

    public BDGArrayList() {
        this(10);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new ImplementIterator();
    }

    public class ImplementIterator implements Iterator<E> {
        int cursor; // index of the next element to return

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        public E next() {
            return data[cursor++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Object[] toArray() {
        //do not implement this
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        //do not implement this
        return null;
    }

    @Override
    public boolean add(E e) {
        if (size >= data.length) {
            E[] finalArray = (E[]) new Object[data.length + 30];
            System.arraycopy(data, 0, finalArray, 0, data.length);
            finalArray[size++] = e;
            data = finalArray;
        } else {
            data[size++] = e;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.arraycopy(data, index + 1, data, index, data.length - index);
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
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

    }

    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        Collection<Integer> integers = new BDGArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);

        for (Integer i : integers) {
            System.out.println(i);
        }

        System.out.println(integers);
    }
}