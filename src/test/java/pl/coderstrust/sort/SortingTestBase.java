package pl.coderstrust.sort;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(JUnitParamsRunner.class)
public abstract class SortingTestBase {

    public abstract SortingMethod getSortingMethod();

    SortingMethod test = getSortingMethod();


    @Rule
    public ExternalResource externalResource = new ExternalResource() {
        private long startTime;

        protected void before() {
            this.startTime = System.currentTimeMillis();
        }

        protected void after() {
            long endTime = System.currentTimeMillis();
            System.out.println("Time: " + (endTime - startTime));
        }
    };

    public Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 4, 1, 6, 3, 5}, new int[]{1, 1, 3, 4, 5, 6}},
                {new int[]{}, new int[]{}},
                {new int[]{1}, new int[]{1}},
                {new int[]{1, 0}, new int[]{0, 1}},
                {new int[]{1, 1, 1}, new int[]{1, 1, 1}},
                {new int[]{6, 7, 9}, new int[]{6, 7, 9}},
                {new int[]{8, 9, 8, 3, 9}, new int[]{3, 8, 8, 9, 9}},
        });
    }

    @Parameters(method = "parameters")
    @Test
    public void testForDifferentArrays(int[] actual, int[] expected) {
        int[] result = test.sort(actual);
        assertArrayEquals(expected, result);
    }
}
