package pl.coderstrust.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public abstract class SortingTestBase {

    public abstract SortingMethod getSortingMethod();

    @Test
    public void testForSortSimpleArray() {
        // given
        int[] given = new int[]{5, 4, 3, 2, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5};

        // when
        long startTime = System.currentTimeMillis();
        SortingMethod test = getSortingMethod();
        int[] result = test.sort(given);
        long endTime = System.currentTimeMillis();

        System.out.println("Time: " + (endTime - startTime));

        // then
        assertArrayEquals(expected, result);
    }

    @Test
    public void testForEmptyArray() {
        // given
        int[] given = new int[]{};
        int[] expected = new int[]{};

        // when
        long startTime = System.currentTimeMillis();
        SortingMethod test = getSortingMethod();
        int[] result = test.sort(given);
        long endTime = System.currentTimeMillis();

        System.out.println("Time: " + (endTime - startTime));

        // then
        assertArrayEquals(expected, result);
    }
    
}
