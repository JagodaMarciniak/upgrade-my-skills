package pl.coderstrust.sort;

import org.junit.BeforeClass;

public class CountingSortTest extends SortingTestBase {

    @BeforeClass
    public static void before() {
        System.out.println(CountingSortTest.class.getSimpleName() + " running..");
    }

    @Override
    public SortingMethod getSortingMethod() {
        return new CountingSort();
    }
}
