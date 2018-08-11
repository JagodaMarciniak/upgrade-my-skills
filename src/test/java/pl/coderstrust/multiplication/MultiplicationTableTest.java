package pl.coderstrust.multiplication;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class MultiplicationTableTest {
    @Test
    public void shouldTestZeroValue() {
        // when
        int size = 0;
        List<String> expected = new ArrayList<String>(Collections.singleton("Invalid value"));

//         given
        List<String> actual = new ArrayList<String>(MultiplicationTable.printMultiplicationTable(size));


        // then
        assertTrue(expected.equals(actual));
    }

    @Test
    public void shouldTestNegativeValues() {
        // when
        int size = -8;
        List<String> expected = new ArrayList<String>(Collections.singleton("Invalid value"));

//         given
        List<String> actual = new ArrayList<String>(MultiplicationTable.printMultiplicationTable(size));


        // then
        assertTrue(expected.equals(actual));
    }

    @Test
    public void shouldTestPositiveValues() {
        // when
        int size = 10;
        List<String> expected = new ArrayList<String>();


        // given
        List<String> actual = new ArrayList<String>(MultiplicationTable.printMultiplicationTable(size));

        // then
        assertTrue(expected.equals(actual));
    }
}
