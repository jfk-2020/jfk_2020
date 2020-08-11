package com.jfk.collections;

import java.util.*;

public class HomeWorkLinkedList<E> implements List<E> {

    private Node head;
    private Node tail;
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
        return new Iterator<E>() {

            Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if (hasNext()) {
                    E data = current.element;
                    current = current.next;
                    return data;
                }
                return (E) iterator();
            }
        };
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
        Node current = head;
        if (current == null) {
            return false;
        }
        if (current.element.equals(o)) {
            current.next.previous = null;
            size--;
        }
        while (current.next != null) {
            current = current.next;
            if (current.element.equals(o)) {
                current.previous.next = current.next;
                size--;
                return true;
            }
        }
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
        Iterator<?> iterator = c.iterator();
        int i = index;
        while(iterator.hasNext()){
            this.add(i, (E) iterator.next());
            i++;
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        Iterator<?> iterator = c.iterator();
        while (iterator.hasNext()) {
            remove(iterator.next());
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        Node temp = head;
        boolean t = false;
        while (temp != null) {
            if (!c.contains(temp.element)) {
                this.remove(temp.element);
                t = true;
            }
            temp = temp.next;
        }
        return t;
    }

    @Override
    public void clear() {
        size = 0;
        head.next = null;
        tail.previous = null;
        head = tail = null;
    }

    @Override
    public E get(int index) {
        int current = 0;

        while (current != index) {
            head = head.next;
            current++;
        }
        return (E) head;
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
        HomeWorkLinkedList.Node next;
        HomeWorkLinkedList.Node previous;

        Node(HomeWorkLinkedList.Node previous, E element, HomeWorkLinkedList.Node next) {
            this.previous = previous;
            this.element = element;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = new BDGLinkedList<>();
        integers.add(10);
        integers.add(20);
        integers.add(40);
        System.out.println(integers.contains(100));

    }
}