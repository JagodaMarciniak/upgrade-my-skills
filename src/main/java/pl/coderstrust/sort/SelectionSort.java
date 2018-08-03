package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {3, 20, 7, 40, 15, 27, 0};
        System.out.println("Unsorted array : ");
        System.out.println(Arrays.toString(array));
        System.out.println("Sorted array :");
        System.out.println(Arrays.toString(selectionSort(array)));
    }

    public static int[] selectionSort(int[] array) {
        int[] arrayToSort = Arrays.copyOf(array, array.length);
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            int indexOfMinNumber = i;
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[j] < arrayToSort[indexOfMinNumber]) {
                    indexOfMinNumber = j;
                }
            }
            swap(arrayToSort, i, indexOfMinNumber);
        }
        return arrayToSort;
    }

    private static void swap(int[] array, int indexA, int indexB) {
        int smallerNumber = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = smallerNumber;
    }
}
