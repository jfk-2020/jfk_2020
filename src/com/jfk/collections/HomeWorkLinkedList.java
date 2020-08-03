package com.jfk.collections;

import java.util.*;

public class HomeWorkLinkedList<E> implements List<E> {

    private Node head;
    private int size = 0;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Node current = head;
        while (current.next != null) {
            if (current.element.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = new Iterator<E>() {
            int index = 0;
            Node current = head;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public E next() {
                index++;
                return get(index);
            }
        };
        return iterator;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int i = 0;
        Node current = head;
        while (head != null) {
            array[i] = head.element;
            i++;
            current = current.next;
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            a = Arrays.copyOf(a, size);
        }
        int i = 0;
        Node current = head;
        while (current != null) {
            a[i] = (T) head.element;
            i++;
            current = current.next;
        }
        return a;
    }

    @Override
    public boolean add(E e) {
        if (this.head == null) {
            this.head = new HomeWorkLinkedList.Node(null, e, null);
            this.size = 1;
            return true;
        }
        HomeWorkLinkedList.Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new HomeWorkLinkedList.Node(current, e, null);
        this.size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        Iterator<?> iterator = c.iterator();
        if (c.size() > this.size()) {
            return false;
        }
        while (iterator.hasNext()) {
            if (!contains(iterator.next()))
                return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        Iterator<?> iterator = c.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            this.add(i, (E) iterator.next());
            i++;
        }
        return true;
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

    private class Node {
        E element;
        Node next;
        Node previous;

        Node(Node previous, E element, Node next) {
            this.previous = previous;
            this.element = element;
            this.next = next;
        }
    }

    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder  builder = new StringBuilder("[");

        Node current = head;
        while (current != null) {
            builder.append(current.element).append(", ");
            current = current.next;
        }
        builder.append("]");
        return builder.toString().replace(", ]", "]");
    }

    public static void main(String[] args) {
        List<Integer> integers = new HomeWorkLinkedList<>();
        integers.add(10);
        integers.add(20);
        integers.add(40);
        List<Integer> toAdd = new HomeWorkLinkedList<>();
        toAdd.add(11);
        integers.addAll(toAdd);
        System.out.println(integers);

    }
}
