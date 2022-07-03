package edu.dsw.pp2.i47109.cw5.zad6;

public class Demo {
    public static void main(String[] args) {
        TernaryTree<Integer> tree = new TernaryTree<Integer>();
        tree.add(new int[]{2, 2, 1, 4, 3, 8, 9, 4, 3});
        /**
         *           2
         *         / | \
         *       1   2  4
         *            / | \
         *           3  4  8
         *           |      \
         *           3       9
         *
         */

        System.out.println("Height" + tree.getDepth());
    }
}
