package com.jfk.collections;

import java.util.Collection;
import java.util.Iterator;

public class BDGArrayList<E> implements Collection<E> {

    private E data[];
    private int size = 0;

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
        //do not implement this
        return null;
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
            finalArray[++size] = e;
            data = finalArray;
        } else {
            data[++size] = e;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                E[] newArray = (E[]) new Object[data.length + -1];
                for (int j = 0, k = 0; j < data.length; j++) {
                    if (i == index) {
                        continue;
                    }
                    newArray[k++] = data[j];
                }
                return true;
            }
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
}