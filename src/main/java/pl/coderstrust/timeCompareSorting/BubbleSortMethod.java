package pl.coderstrust.timeCompareSorting;

import pl.coderstrust.sort.BubbleSort;

public class BubbleSortMethod implements SortingMethod {
    @Override
    public int[] sort(int[] array) {
        return BubbleSort.bubbleSort(array);
    }
}
