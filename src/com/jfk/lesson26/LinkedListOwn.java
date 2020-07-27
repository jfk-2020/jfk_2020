package com.jfk.lesson26;

import java.util.*;

public class LinkedListOwn<E> implements List<E> {

    private Node<E> firstPart;
    private Node<E> endPart;

    private int size = 0;

    private class Node<E> {
        Node<E> firstPoint;
        Node<E> endPoint;
        E element;
        Node(E element) {
            this.element = element;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        Node<E> newElement = new Node<E>(e);
        if (firstPart == null) {
            firstPart = newElement;
            endPart = newElement;
        } else {
            endPart.endPoint = newElement;
            newElement.firstPoint = endPart;
            endPart = newElement;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Node<E> tempPart = firstPart;
        while(tempPart != null) {
            if (tempPart.element.equals(o)) {
                tempPart.element = null;
                if (tempPart.firstPoint != null) {
                    if (tempPart.endPoint != null){
                        tempPart.firstPoint.endPoint = tempPart.endPoint;
                        tempPart.endPoint.firstPoint = tempPart.firstPoint;
                        return true;
                    } else {
                        tempPart.endPoint = null;
                    }
                } else {
                    if (tempPart.endPoint != null) {
                        tempPart.endPoint.firstPoint = null;
                        firstPart = tempPart.endPoint;
                        if (endPart.equals(tempPart)) {
                            endPart = tempPart.endPoint;
                        }
                    }
                }
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
    public boolean addAll(int index, Collection<? extends E> c) {
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

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
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
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
