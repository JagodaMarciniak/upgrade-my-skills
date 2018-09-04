package pl.coderstrust.sort;

import org.junit.Test;

public class MergeSortTest extends SortingTestBase {

    @Test
    public SortingMethod getSortingMethod() {
        return new MergeSort();
    }
}
