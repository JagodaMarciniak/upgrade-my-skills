package pl.coderstrust.multiplication;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MultiplicationTableTest {
    @Test
    public void testZeroSize() {
        // given
        int size = 0;
        int[][] expected = new int[0][0];

        // when
        int[][] actual = MultiplicationTable.getMultiplicationTable(size);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNegativeSize() {
        // given
        int size = -8;
        int[][] expected = new int[0][0];

        // when
        int[][] actual = MultiplicationTable.getMultiplicationTable(size);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSizeOfFive() {
        // given
        int size = 5;
        int[][] expected = new int[][]{
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}};

        // when
        int[][] actual = MultiplicationTable.getMultiplicationTable(size);

        // then
        assertArrayEquals(expected, actual);
    }
}
