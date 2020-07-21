package com.jfk.collections;

import java.util.*;

/**
 * @author William Arustamyan
 */


public class CollectionFramework {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(3);
        integers.add(3);
        integers.add(3);
        integers.add(3);
        integers.add(3);
        integers.add(3);
        integers.add(3);
        integers.add(3);
        integers.add(3);

        integers.add(3);
        integers.add(3);
        integers.add(3);
        integers.add(4);

        System.out.println(integers.contains(4));

        System.out.println(integers);
        Integer integer = integers.get(3);
        integers.set(2, 40);

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);

        Set<Test> tests = new HashSet<>();
        Test general = new Test(10);
        tests.add(new Test(10));
        tests.add(new Test(10));


        System.out.println(tests.contains(new Test(10)));
//        tests.add(general);
//        tests.add(general);
        System.out.println(tests);
    }

    private static class Test {
        int x;
        Test(int x) {
            this.x = x;
        }

        @Override
        public String toString() {
            return "Test{" +
                    "x=" + x +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Test test = (Test) o;
            return x == test.x;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x);
        }
    }
}
