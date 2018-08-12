package pl.coderstrust.christmastree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class ChristmasTreeTest {

    @Test
    public void testSizeOfZero() {
        //when
        int size = 0;
        List<String> expected = new ArrayList<String>(Collections.singletonList("Invalid value"));

        //given
        List<String> actual = new ArrayList<String>(ChristmasTree.getChristmasTree(size));

        //then
        assertTrue(expected.equals(actual));
    }

    public void testNegativeSize() {
        //when
        int size = -5;
        List<String> expected = new ArrayList<String>(Collections.singletonList("Invalid value"));

        //given
        List<String> actual = new ArrayList<String>(ChristmasTree.getChristmasTree(size));

        //then
        assertTrue(expected.equals(actual));
    }

    @Test
    public void testSizeofFive() {
        //when
        int size = 5;
        List<String> expected = new ArrayList<String>();
        expected.add("    *");
        expected.add("   ***");
        expected.add("  *****");
        expected.add(" *******");
        expected.add("*********");
        expected.add("   **");

        //given
        List<String> actual = new ArrayList<String>(ChristmasTree.getChristmasTree(size));

        //then
        assertTrue(expected.equals(actual));
    }
}
