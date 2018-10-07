package pl.coderstrust.sort;

import org.junit.BeforeClass;

public class SelectionSortTest extends SortingTestBase {

    @BeforeClass
    public static void before() {
        System.out.println(SelectionSortTest.class.getSimpleName() + " running..");
    }

    @Override
    public SortingMethod getSortingMethod() {
        return new SelectionSort();
    }
}
