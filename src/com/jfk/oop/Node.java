package com.jfk.oop;

/**
 * @author William Arustamyan
 */

public class Node {

    int value;
    Node child;

    public Node(int value, Node child){
        this.value = value;
        this.child = child;

    }

    public static void main(String[] args) {
        System.out.println(new Node(10, new Node(12, null)));
    }

    @Override
    public String toString() {
        if (child == null) {
            return "Node : { value : " + value + ", child : null }";
        }
        return "Node : { value : " + value + ", child : " + child.toString() + " }";
    }
}
