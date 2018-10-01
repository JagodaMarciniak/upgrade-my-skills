package pl.coderstrust.sort;

import org.junit.BeforeClass;

public class BubbleSortTest extends SortingTestBase {

    @BeforeClass
    public static void before() {
        System.out.println(BubbleSortTest.class.getSimpleName() + " running..");
    }

    @Override
    public SortingMethod getSortingMethod() {
        return new BubbleSort();
    }
}
