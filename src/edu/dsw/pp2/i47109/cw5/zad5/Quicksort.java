package edu.dsw.pp2.i47109.cw5.zad5;

public class Quicksort {
    public Quicksort(int[] array) {
        if (array.length < 2) {
            return; // already sorted
        }

        this.quicksort(array, 0, array.length - 1);
    }

    private void quicksort(int[] array, int start, int end) {
        if (start < end) {
            int pivotIndex = this.partition(array, start, end);
            this.quicksort(array, start, pivotIndex - 1);
            this.quicksort(array, pivotIndex + 1, end);
        }
    }


    private int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] <= pivot) {
                i++;
                this.swap(array, i, j);
            }

        }
        this.swap(array, i + 1, end);
        return i + 1;
    }


    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
