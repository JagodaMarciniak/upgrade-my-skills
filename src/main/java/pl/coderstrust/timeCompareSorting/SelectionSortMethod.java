package pl.coderstrust.timeCompareSorting;

import pl.coderstrust.sort.SelectionSort;

public class SelectionSortMethod implements SortingMethod {

    @Override
    public int[] sort(int[] array) {
        return SelectionSort.selectionSort(array);
    }
}
