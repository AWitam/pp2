package edu.dsw.pp2.i47109.cw5.zad5;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        int[] array = {2, 4, 0, 1};
        System.out.printf("Array before sorting: %s%n", Arrays.toString(array));
        Quicksort q = new Quicksort(array);
        System.out.printf("Array after sorting: %s%n", Arrays.toString(array));

    }
}
