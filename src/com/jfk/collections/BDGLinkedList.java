package com.jfk.collections;

import java.util.*;

/**
 * @author William Arustamyan
 */


public class BDGLinkedList<E> implements List<E> {

    private Node<E> first;
    private Node<E> last;
    private int size = 0;


    public BDGLinkedList() {

    }

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
        if (size == 0) {
            return false;
        }
        Node<E> temp = first;
        while (temp != null) {
            if (temp.element.equals(o))
                return true;
            temp = temp.next;
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {

        Iterator<E> iterator = new Iterator<E>() {
            Node<E> temp = first;

            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public E next() {
                E pow = temp.element;
                temp = temp.next;
                return pow;
            }
        };
        return iterator;
    }

    @Override
    public Object[] toArray() {
        Object[] object = new Object[size];
        int i = 0;
        Node<E> temp = first;
        while (temp != null) {
            object[i] = first.element;
            i++;
            temp = temp.next;
        }
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            a = Arrays.copyOf(a, size);
        }
        int i = 0;
        Node<E> temp = first;
        while (temp != null) {
            a[i] = (T) first.element;
            i++;
            temp = temp.next;
        }
        return a;
    }

    @Override
    public boolean add(E e) {
        if (this.first == null) {
            this.first = new Node<>(null, e, null);
            this.size = 1;
            return true;
        }
        Node<E> current = first;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node<>(current, e, null);
        this.last = current.next;
        this.size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        Iterator<?> iterator1 = c.iterator();
        if (c.size() > this.size()) {
            return false;
        }
        while (iterator1.hasNext()) {
            if (!contains(iterator1.next()))
                return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        Iterator<?> iterator = c.iterator();
        int i = size;
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
        while (iterator.hasNext()) {
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
        Node<E> temp = first;
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
        first.next = null;
        last.previous = null;
        first = last = null;
    }

    @Override
    public E get(int index) {
        if (size == 0 || size < index) {
            throw new NoSuchElementException("currentIndex:" + size + " , index:" + index);
        }
        Node<E> temp;
        int count;
        if (index <= size / 2) {
            temp = first;
            count = 0;
            while (temp != null) {
                if (count == index)
                    return temp.element;
                count++;
                temp = temp.next;
            }
        } else {
            temp = last;
            count = size - 1;
            while (temp != null) {
                if (count == index)
                    return temp.element;
                count--;
                temp = temp.previous;
            }
        }
        return null;

    }

    @Override
    public E set(int index, E element) {
        if (size == 0 || size < index) {
            throw new NoSuchElementException("currentIndex:" + size + " , index:" + index);
        }
        Node<E> temp;
        int count;
        E pow;
        if (index <= size / 2) {
            temp = first;
            count = 0;
            while (temp != null) {
                if (count == index) {
                    pow = temp.element;
                    temp.element = element;
                    return pow;
                }
                count++;
                temp = temp.next;
            }
        } else {
            temp = last;
            count = size - 1;
            while (temp != null) {
                if (count == index) {
                    pow = temp.element;
                    temp.element = element;
                    return pow;
                }
                count--;
                temp = temp.previous;
            }
        }
        return null;
    }

    @Override
    public void add(int index, E element) {
        if (size == 0 || size < index)
            throw new NoSuchElementException("currentIndex:" + size + " , index:" + index);
        Node<E> temp;
        int count;
        Node<E> el = new Node<>(null, element, null);
        if (index <= size / 2) {
            temp = first;
            count = 0;
            while (temp != null) {
                if (count == index) {
                    el.next = temp;
                    Node<E> pre = temp.previous;
                    temp.previous = el;
                    el.previous = pre;
                    pre.next = el;
                    size++;
                    return;
                }
                count++;
                temp = temp.next;
            }
        } else {

            if (index >= size) {
                last.next = new Node<>(last, element, null);
                last = last.next;
                size++;
                return;
            }

            temp = last;
            count = size - 1;
            while (temp != null) {
                if (count == index) {
                    el.next = temp;
                    Node<E> pre = temp.previous;
                    temp.previous = el;
                    el.previous = pre;
                    pre.next = el;
                    size++;
                    return;
                }
                count--;
                temp = temp.previous;
            }
        }
    }

    @Override
    public E remove(int index) {
        if (size == 0 || size < index)
            throw new NoSuchElementException("currentIndex:" + size + " , index:" + index);
        E pow;
        Node<E> temp;
        Node<E> el;
        int count;
        if (index <= size / 2) {
            temp = first;
            count = 0;
            while (temp != null) {
                if (count == index) {
                    pow = temp.element;
                    el = temp.previous;
                    el.next = temp.next;
                    temp.next.previous = el;
                    size--;
                    return pow;
                }
                count++;
                temp = temp.next;
            }
        } else {
            temp = last;
            count = size - 1;
            while (temp != null) {
                if (count == index) {
                    pow = temp.element;
                    el = temp.previous;
                    el.next = temp.next;
                    temp.next.previous = el;
                    size--;
                    return pow;
                }
                count--;
                temp = temp.previous;
            }
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
        if (o == null)
            throw new NullPointerException("Is " + o);
        BDGLinkedList.Node temp;
        temp = first;
        int count = 0;
        while (temp != null) {
            if (temp.element.equals(o)) {
                return count;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (o == null) {
            throw new NullPointerException("Is " + o);
        }
        Node<E> temp;
        temp = last;
        int count = size - 1;
        while (temp != null) {
            if (temp.element.equals(o)) {
                return count;
            }
            count--;
            temp = temp.previous;
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        ListIterator<E> listIterator = new ListIterator<E>() {
            Node<E> temp = first;
            private int index = 0;

            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public E next() {
                E pow = temp.element;
                temp = temp.next;
                index++;
                return pow;
            }

            @Override
            public boolean hasPrevious() {
                return temp != null;
            }

            @Override
            public E previous() {
                E pow = temp.element;
                temp = temp.previous;
                if (index != 0)
                    index--;
                return pow;
            }

            @Override
            public int nextIndex() {
                return index;
            }

            @Override
            public int previousIndex() {
                return index - 1;
            }

            @Override
            public void remove() {
                BDGLinkedList.this.remove(index);
            }

            @Override
            public void set(E e) {
                BDGLinkedList.this.set(index, e);
            }

            @Override
            public void add(E e) {
                BDGLinkedList.this.add(index, e);
            }
        };
        return listIterator;
    }

    @Override
    public ListIterator<E> listIterator(int in) {
        Node<E> pow = first;
        int i = 0;
        while (i != in) {
            pow = pow.next;
            i++;
        }
        Node<E> finalPow = pow;
        ListIterator<E> listIterator = new ListIterator<E>() {
            Node<E> temp = finalPow;
            private int index = in;

            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public E next() {
                E pow = temp.element;
                temp = temp.next;
                index++;
                return pow;
            }

            @Override
            public boolean hasPrevious() {
                return temp != null;
            }

            @Override
            public E previous() {
                E pow = temp.element;
                temp = temp.previous;
                if (index != 0)
                    index--;
                return pow;
            }

            @Override
            public int nextIndex() {
                return index;
            }

            @Override
            public int previousIndex() {
                return index - 1;
            }

            @Override
            public void remove() {
                BDGLinkedList.this.remove(index);
            }

            @Override
            public void set(E e) {
                BDGLinkedList.this.set(index, e);
            }

            @Override
            public void add(E e) {
                BDGLinkedList.this.add(index, e);
            }
        };
        return listIterator;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");

        Node<E> current = first;
        while (current != null) {
            builder.append(current.element).append(", ");
            current = current.next;
        }
        builder.append("]");
        return builder.toString().replace(", ]", "]");
    }

    private class Node<E> {

        E element;
        Node<E> next;
        Node<E> previous;

        Node(Node<E> previews, E element, Node<E> next) {
            this.previous = previews;
            this.element = element;
            this.next = next;
        }
    }


    public static void main(String[] args) {
        List<Integer> integers = new BDGLinkedList<>();
        integers.add(10);
        integers.add(20);
        integers.add(40);
        List<Integer> toAdd = new BDGLinkedList<>();
        toAdd.add(11);
        toAdd.add(12);
        integers.addAll(toAdd);
        System.out.println(integers);


    }
}