package pl.coderstrust.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 1, 10, 55, 0};
        int[] arrayToSort = Arrays.copyOf(array, array.length);
        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(arrayToSort));
        bubbleSort(arrayToSort);
        System.out.println();
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arrayToSort));
    }

    public static int[] bubbleSort(int[] array) {
        for (boolean sorted = false; !sorted; ) {
            sorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    swap(array, i, i - 1);
                    sorted = false;
                }
            }
        }
        return array;
    }

    private static void swap(int[] array, int indexA, int indexB) {
        int smallerNumber = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = smallerNumber;
    }
}
