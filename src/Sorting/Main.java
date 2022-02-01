package Sorting;

import basicPart1.JavaBasics1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        BubbleSort bubble = new BubbleSort();
        int[] intArray = {5, 90, 3, 89, 5, 78, 546, 125, 876, 10, 1, 15, 36, 78};

//        JavaBasics1.printExerciseNum(1);
//        System.out.println(Arrays.toString(intArray));
//        sort.Exercise1(intArray);
//        System.out.println(Arrays.toString(intArray));


        JavaBasics1.printExerciseNum(2);

        System.out.println(Arrays.toString(intArray));
        bubble.sort(intArray);
        System.out.println(Arrays.toString(intArray) + "\n");
        int[] intArray2 = {5, 90, 3, 89, 5, 78, 546, 125, 876, 10, 1, 15, 36, 78};
        bubble.bubblesort(intArray2);

        System.out.println(Arrays.toString(intArray) + "\n");
    }
}
