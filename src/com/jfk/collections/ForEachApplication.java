package com.jfk.collections;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

/**
 * @author William Arustamyan
 */


public class ForEachApplication {


    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        for (int i = 0; i < integers.size(); i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(integers.get(i));
        }

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer);
            }
        };
        integers.forEach(consumer);

        Set<Integer> set = Set.of(2, 4, 5, 3);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        int x = 0;
        for (Integer integer : set) {
            if (x == 3) {
                continue;
            } else {
                System.out.println(integer);
            }
            x++;
        }

    }
}
