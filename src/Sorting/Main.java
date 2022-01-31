package Sorting;

import basicPart1.JavaBasics1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorting sort = new Sorting();

        JavaBasics1.printExerciseNum(1);
        int[] intArray = {5,90,3,89,5,78,546,125,876};
        System.out.println(Arrays.toString(intArray));
        sort.Exercise1(intArray);
        System.out.println(Arrays.toString(intArray));


    }
}
