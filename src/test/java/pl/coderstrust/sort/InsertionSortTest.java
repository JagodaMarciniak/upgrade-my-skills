package pl.coderstrust.sort;

import org.junit.BeforeClass;

public class InsertionSortTest extends SortingTestBase {

    @BeforeClass
    public static void before() {
        System.out.println(InsertionSortTest.class.getSimpleName() + " running..");
    }

    @Override
    public SortingMethod getSortingMethod() {
        return new InsertionSort();
    }
}
