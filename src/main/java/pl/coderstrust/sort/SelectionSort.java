package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {3, 20, 7, 40, 15, 27, 0};
        int[] arrayToSort = Arrays.copyOf(array, array.length);
        System.out.println("Unsorted array : ");
        System.out.println(Arrays.toString(arrayToSort));
        System.out.println();
        selectionSort(arrayToSort);
        System.out.println("Sorted array :");
        System.out.println(Arrays.toString(arrayToSort));
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexOfMinNumber = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexOfMinNumber]) {
                    indexOfMinNumber = j;
                }
            }
            swap(array, i, indexOfMinNumber);
        }
        return array;
    }

    private static void swap(int[] array, int indexA, int indexB) {
        int smallerNumber = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = smallerNumber;
    }
}
