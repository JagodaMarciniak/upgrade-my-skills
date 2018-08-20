package pl.coderstrust.sort;

import java.util.Arrays;

public class BubbleSort implements SortingMethod {

    public int[] sort(int[] array) {
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
