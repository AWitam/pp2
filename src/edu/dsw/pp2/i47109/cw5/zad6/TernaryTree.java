package edu.dsw.pp2.i47109.cw5.zad6;

/*
 * Ternary tree:
 *
 *       R
 *    /  |  \
 *   l   m   r
 *  /|\  |   |\
 * l m r m   m r
 *
 */

public class TernaryTree<T> {
    Node<Integer> root;

    public Node<Integer> add(int[] values) {
        for (int value : values) {
            root = addRecursive(root, value);
        }
        return this.root;
    }

    public int getDepth() {
        return this.recursiveTTDepth(this.root);
    }

    private Node<Integer> addRecursive(Node<Integer> current, int value) {

        if (current == null) {
            return new Node<Integer>(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        }

        if (value == current.value) {
            current.middle = addRecursive(current.middle, value);
        } ;

        if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    private int recursiveTTDepth(Node<Integer> root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = this.recursiveTTDepth(root.left);
        int middleHeight = this.recursiveTTDepth(root.middle);
        int rightHeight = this.recursiveTTDepth(root.right);

        return Math.max(leftHeight, Math.max(middleHeight, rightHeight)) + 1;

    }

}
