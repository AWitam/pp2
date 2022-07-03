package edu.dsw.pp2.i47109.cw5.zad6;

public class Node<T> {
    int value;
    Node<Integer> left;
    Node<Integer> middle;
    Node<Integer> right;

    public Node(int value) {
        this.value = value;
        left = null;
        middle = null;
        right = null;
    }

}
