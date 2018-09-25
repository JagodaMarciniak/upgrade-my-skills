package pl.coderstrust.sort;

import java.util.Arrays;

public class CountingSort implements SortingMethod {

    @Override
    public int[] sort(int array[]) {
        int[] arrayToSort = Arrays.copyOf(array, array.length);
        int n = arrayToSort.length;
        int result[] = new int[n];
        int count[] = new int[200];
        for (int i = 0; i < 199; ++i) {
            count[i] = 0;
        }
        for (int i = 0; i < n; ++i) {
            ++count[arrayToSort[i]];
        }
        for (int i = 1; i < 200; ++i) {
            count[i] += count[i - 1];
        }
        for (int i = 0; i < n; ++i) {
            result[count[arrayToSort[i]] - 1] = arrayToSort[i];
            --count[arrayToSort[i]];
        }
        return result;
    }
}
