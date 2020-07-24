package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class BDGArrayList<E> implements Collection<E> {

    public static void main(String[] args) {
        List<Integer> newList = new ArrayList<>();
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(1);
        newList.add(5);
        newList.add(2);

        System.out.println(newList.toString());

        System.out.println(newList.size());
        System.out.println(newList.isEmpty());

        List<Integer> checkingList = new ArrayList<>();
        checkingList.add(2);
        checkingList.add(3);

        System.out.println(newList.contains(3));

        newList.remove(3);
        System.out.println("after remove "+ newList.toString());

        newList.addAll(checkingList);
        System.out.println("after adding "+ newList.toString());

        newList.removeAll(checkingList);
        System.out.println("after remove "+ newList.toString());

        System.out.println(newList.containsAll(checkingList));

        System.out.println(newList.retainAll(checkingList));

        newList.clear();
        System.out.println("after clear "+ newList.toString());
    }
    @Override
    public int size() {
        //is done
        return size();
    }

    @Override
    public boolean isEmpty() {
        //is done
        return false;
    }

    @Override
    public boolean contains(Object o) {
       // is done
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
        //do not implement this
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
        //do not implement this
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
      //  is done
        return false;
    }

    @Override
    public boolean remove(Object o) {
       // is done
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // is done
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        //is done
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        //is done
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // is done
        return false;
    }

    @Override
    public void clear() {
        //is done
    }
}
