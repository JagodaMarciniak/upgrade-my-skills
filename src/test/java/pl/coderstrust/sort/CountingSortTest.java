package pl.coderstrust.sort;

public class CountingSortTest extends SortingTestBase {

    @Override
    public SortingMethod getSortingMethod() {
        return new CountingSort();
    }
}
