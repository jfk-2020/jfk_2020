package collections;

import java.util.Collection;
import java.util.Iterator;

public class BDGArrayList<E> implements Collection<E> {
    private int index ;
    private Object [] arrayObject = new Object[20];
    public BDGArrayList(int index , Object [] arrayObject ){
        this.arrayObject =arrayObject;

    };

    public BDGArrayList() {
    }


    @Override
    public int size() {
        return index;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i <arrayObject.length ; i++) {
            if (arrayObject[i] == null){return true;}
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < arrayObject.length ; i++) {
            if (arrayObject[i]!= null){
            if (arrayObject[i].equals(o)){return true;}
        }else {return false;}}
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
        //do not implement this
    }
    public class MyIterator <E> implements Iterator<Integer> {
    int index = 0;
    int result = 0;
        @Override
        public boolean hasNext() {
            if (index<size()){return true;}
            return false;
        }

        @Override

        public Integer next() {
            if (hasNext()){result = (int) arrayObject[index];index++ ; return result;}
            return null;
        }
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
        
      Object[]newArrayObject = new Object[(int) (arrayObject.length*1.5)];
        for (int i = arrayObject.length; i <newArrayObject.length ; i++) {
           newArrayObject[i]=e; return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        if (o==null){return false;}
        int index = 0;
        Object []removedArray = new Object[arrayObject.length-1];
        for (int i = 0; i < arrayObject.length; i++) {
        if (arrayObject[i].equals(o)){removedArray[i]=arrayObject[i+1+index];index++;}else
        {removedArray[i]=arrayObject[i+index];}
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        if (c.size()<=arrayObject.length ){
            Object[]newObject=c.toArray();
            for (int i = 0; i <newObject.length ; i++) {
             if (c.contains(arrayObject[i])){continue;}else{return false;}
            }
        }
        return true;
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
