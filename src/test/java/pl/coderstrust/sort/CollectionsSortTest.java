package pl.coderstrust.sort;

import org.junit.BeforeClass;

public class CollectionsSortTest extends SortingTestBase {

    @BeforeClass
    public static void before() {
        System.out.println(CollectionsSortTest.class.getSimpleName() + " running..");
    }

    @Override
    public SortingMethod getSortingMethod() {
        return new CollectionsSort();
    }
}
