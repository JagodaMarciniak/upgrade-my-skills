package pl.coderstrust.multiplication;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class MultiplicationTableTest {
    @Test
    public void testZeroSize() {
        // given
        int size = 0;
        List<String> expected = new ArrayList<String>(Collections.singleton("Invalid value"));

        // when
        List<String> actual = new ArrayList<String>(MultiplicationTable.getMultiplicationTable(size));

        // then
        assertTrue(expected.equals(actual));
    }

    @Test
    public void testNegativeSize() {
        // given
        int size = -8;
        List<String> expected = new ArrayList<String>(Collections.singleton("Invalid value"));

        // when
        List<String> actual = new ArrayList<String>(MultiplicationTable.getMultiplicationTable(size));

        // then
        assertTrue(expected.equals(actual));
    }

    @Test
    public void testSizeOfFive() {
        // given
        int size = 5;
        List<String> expected = new ArrayList<String>();
        expected.add(" 1 2 3 4 5 2 4 6 8 10 3 6 9 12 15 4 8 12 16 20 5 10 15 20 25");

        // when
        List<String> actual = new ArrayList<String>(MultiplicationTable.getMultiplicationTable(size));

        // then
        assertTrue(expected.equals(actual));
    }
}
