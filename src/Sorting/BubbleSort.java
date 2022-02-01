package Sorting;

import java.util.Arrays;

public class BubbleSort {
    /*
    BubbleSort
    1) Create swap helper function to swap to variables in the array
    2) Iterate over all values and swap values where the right value is greater than the left value
    -> this results in the final value being in place
    3) call function recursively to sort until all values are in place
     */
    public void sort(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if(A[i]>A[i+1]){
                swap(A,i,i+1);
                System.out.println(Arrays.toString(A));
                sort(A);
            }
        }
    }
    public void bubblesort(int[] A){
        int n = A.length;
        for (int i=0;i<n-1;i++){
            for(int j=0;j< n-i-1;j++){
                if (A[j]> A[j+1]){
                    swap(A,i, j);
                   System.out.println(Arrays.toString(A));
                }
            }
        }
    }

    public void swap(int[] A, int valueIndex1, int valueIndex2) {
        int temp = A[valueIndex1];
        A[valueIndex1] = A[valueIndex2];
        A[valueIndex2] = temp;
    }
}
