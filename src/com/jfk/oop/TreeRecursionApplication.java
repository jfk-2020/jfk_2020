package com.jfk.oop;

/**
 * @author William Arustamyan
 */

public class TreeRecursionApplication {


    public static void main(String[] args) {
        Node c = new Node();
        c.value = 14;
        c.child = null;

        Node b = new Node();
        b.value = 7;
        b.child = c;

        Node a = new Node();
        a.value = 3;
        a.child = b;

        Node root = new Node();
        root.value = 1;
        root.child = a;

        int result = calculateValuesRec(root);
        System.out.println(calcSum(2));
    }

    static int calcSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + calcSum(n - 1);
    }

    static int calculateValuesRec(Node root) {
        if (root.child == null) {
            return root.value;
        }
        return root.value + calculateValuesRec(root.child);
    }


    static int calculateValues(Node root) {
        Node current = root;
        int sum = 0;
        while (current != null) {
            sum = sum + current.value;
            current = current.child;
        }
        return sum;
    }
}
