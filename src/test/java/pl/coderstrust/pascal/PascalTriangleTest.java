package pl.coderstrust.pascal;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class PascalTriangleTest {
    @Test
    public void testSizeOfZero() {
        //when
        int size = 0;
        List<String> expected = new ArrayList<String>(Collections.singletonList("Invalid value"));

        //given
        List<String> actual = new ArrayList<String>(PascalTriangle.getPascalTriangle(size));

        //then
        assertTrue(expected.equals(actual));
    }

    @Test
    public void testNegativeSize() {
        //when
        int size = -5;
        List<String> expected = new ArrayList<String>(Collections.singletonList("Invalid value"));

        //given
        List<String> actual = new ArrayList<String>(PascalTriangle.getPascalTriangle(size));

        //then
        assertTrue(expected.equals(actual));
    }

    @Test
    public void testSizeOfSix() {
        //when
        int size = 6;
        List<String> expected = new ArrayList<String>();
        expected.add("           1 ");
        expected.add("         1 1 ");
        expected.add("       1 2 1 ");
        expected.add("     1 3 3 1 ");
        expected.add("   1 4 6 4 1 ");
        expected.add(" 1 5 10 10 5 1 ");

        //given
        List<String> actual = new ArrayList<String>(PascalTriangle.getPascalTriangle(size));

        //then
        assertTrue(expected.equals(actual));
    }
}
