package pl.coderstrust.sort;

import java.util.Arrays;

public class MergeSort implements SortingMethod {

    private int[] array;
    private int[] tempMergArr;
    private int length;

    public int[] sort(int array[]) {
        int[] arrayToSort = Arrays.copyOf(array, array.length);
        this.array = arrayToSort;
        this.length = arrayToSort.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
        return arrayToSort;
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
    }
}
