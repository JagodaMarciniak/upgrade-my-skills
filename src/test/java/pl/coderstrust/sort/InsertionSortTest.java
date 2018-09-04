package pl.coderstrust.sort;

public class InsertionSortTest extends SortingTestBase {
    @Override
    public SortingMethod getSortingMethod() {
        return new InsertionSort();
    }
}
