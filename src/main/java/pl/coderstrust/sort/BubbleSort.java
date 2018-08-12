package pl.coderstrust.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 1, 10, 55, 0};
        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(array));
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    public static int[] bubbleSort(int[] array) {
        int[] arrayToSort = Arrays.copyOf(array, array.length);
        for (boolean sorted = false; !sorted; ) {
            sorted = true;
            for (int i = 1; i < arrayToSort.length; i++) {
                if (arrayToSort[i - 1] > arrayToSort[i]) {
                    swap(arrayToSort, i, i - 1);
                    sorted = false;
                }
            }
        }
        return arrayToSort;
    }

    private static void swap(int[] array, int indexA, int indexB) {
        int smallerNumber = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = smallerNumber;
    }
}
