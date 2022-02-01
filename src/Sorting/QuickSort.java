package Sorting;

import org.jetbrains.annotations.NotNull;

import java.util.Random;


public class QuickSort {

    /**
     * Perform a Quick sort algorithm on an Array
     *
     * @param numList unsorted array
     * @return sorted array
     */
    public void Exercise1(int @NotNull [] numList) {
        quicksort(numList, 0, numList.length - 1);
    }

    /**
     * a quicksort algorithm using partitioning
     * @param A integer array
     * @param low the low value used for comparison
     * @param high the high value used for comparison
     */
    private void quicksort(int[] A, int low, int high) {
        if (low < high + 1) {
            int p = partition(A, low, high);
            quicksort(A, low, p - 1);
            quicksort(A, p + 1, high);
        }
    }

    private void swap(int @NotNull [] A, int index1, int index2) {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }

    private int getPivot(int low, int high) {
        Random rand = new Random();
        return rand.nextInt((high - low) + 1) + low;
    }

    private int partition(int[] A, int low, int high) {
        swap(A, low, getPivot(low,high));
        int border = low + 1;
        for (int i = border; i <= high; i++) {
            if (A[i] < A[low]) {
                swap(A, i, border++);
            }
        }
        swap(A, low, border - 1);
        return border - 1;
    }

}
