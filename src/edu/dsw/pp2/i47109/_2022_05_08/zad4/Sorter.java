package edu.dsw.pp2.i47109._2022_05_08.zad4;

import java.util.Arrays;
import java.util.Collections;

public class Sorter {
    public <T> Comparable<T>[] sort(Comparable<T>[] objects) {
        System.out.println("Before sorting: " + Arrays.toString(objects));
        Arrays.sort(objects);
        System.out.println("After sorting: " + Arrays.toString(objects));
        return objects;
    }

    public <T> Comparable<T>[] reverse(Comparable<T>[] objects) {
        System.out.println("Before reverse: " + Arrays.toString(objects));
        Collections.reverse(Arrays.asList(objects));
        System.out.println("After reversing: " + Arrays.toString(objects));
        return objects;
    }
}
