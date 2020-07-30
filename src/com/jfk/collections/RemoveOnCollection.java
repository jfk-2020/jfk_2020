package com.jfk.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author William Arustamyan
 */


public class RemoveOnCollection {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("11");
        strings.add("2");
        strings.add("3");
        strings.add("32");


        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            iterator.next();
        }

        for (int i = 0; i < strings.size(); i++) {
//            System.out.println(strings.get(i));
        }

        List<String> contains = new ArrayList<>();
        for (String string : strings) {
            if (string.endsWith("2")) {
                contains.add(string);
            }
        }
        System.out.println(contains);


        List<Integer> collect = strings.stream().
                filter(s -> s.startsWith("1")).
                map(Integer::parseInt).
                collect(Collectors.toList());

        strings.stream().filter(s -> s.startsWith("1")).findFirst().ifPresent(it -> System.out.println(it));

        System.out.println(collect);

//        strings.forEach((s) -> System.out.println(s + "second"));


//        Iterator<String> iterator = strings.iterator();
//        String removed = "";
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            if (next.equalsIgnoreCase("1")) {
//                removed = next;
//            }
//        }

        strings.removeIf(argument -> argument.equalsIgnoreCase("1"));

        findOne(strings);

//        callThis(() -> System.out.println("call"));


        MyFunc func = new MyFunc() {
            @Override
            public void call() {
//                System.out.println("call");
            }
        };
        callThis(func);
        System.out.println(strings);
    }

    @FunctionalInterface
    interface MyFunc {
        void call();
    }

    static void callThis(MyFunc func) {
        func.call();
    }

    static Optional<String> findOne(List<String> strings) {
        for (String string : strings) {
            if (string.startsWith("1")) {
                return Optional.of(string);
            }
        }
        return Optional.empty();
    }

}
