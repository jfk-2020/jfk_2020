package com.jfk.inter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author William Arustamyan
 */

public class BaseClass extends BaseAbstractClass implements A {



    @Override
    public void aDefault() {

    }


    @Override
    public void b() {

    }

    public static void main(String[] args) {
//        List<Integer> ints = List.of(1, 2, 4, 5, 6, 7, 8);
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i< ints.size(); i++) {
//            if (ints.get(i) > 3) {
//                result.add(ints.get(i));
//            }
//        }
//        List<Integer> collect = ints.stream().filter(it -> it > 3).collect(Collectors.toList());
//        System.out.println(result);
//        System.out.println(collect);
        new BaseClass().a();
    }
}
