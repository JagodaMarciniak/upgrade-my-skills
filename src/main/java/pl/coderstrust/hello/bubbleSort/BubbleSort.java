package pl.coderstrust.hello.bubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {8, 4, 2, 7, 4, 3, 7, 8};
        System.out.println("Unsorted array:");
        printArray(array);
        sort(array);
        System.out.println("Sorted array:");
//        printArray(array);
        Arrays.sort(array);
        printArray(array);
    }

    static void sort(int[] array) {
        // tu posortuj
        boolean changed = true;
        while (changed) {
            changed = false;
            int index = 0;
            for (int i = 0; i < (array.length - 1); i++) {

            }
        }
    }


    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
