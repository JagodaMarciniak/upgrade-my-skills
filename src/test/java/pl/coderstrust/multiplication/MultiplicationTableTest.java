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
        List<String> expected = new ArrayList<String>();
        expected.add("Invalid value");

//         given
        ArrayList<String> actual = new ArrayList<String>();
        actual = MultiplicationTable.printMultiplicationTable(size);

        // then
        assertTrue(expected.equals(actual));
    }

    @Test
    public void shouldTestNegativeValues() {
        // when
        int size = -7;
        ArrayList<String> expected = new ArrayList<String>(Collections.singleton("Invalid value"));

        // given
        ArrayList<String> actual = MultiplicationTable.printMultiplicationTable(size);

        // then
        assertTrue(expected.equals(actual));
    }

    @Test
    public void shouldTestPositiveValues() {
        // when
        int size = 10;
        ArrayList<String> expected = new {
            {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
            },{
                2, 4, 6, 8, 10, 12, 14, 16, 18, 20
            },{
                3, 6, 9, 12, 15, 18, 21, 24, 27, 30
            },{
                4, 8, 12, 16, 20, 24, 28, 32, 36, 40
            },{
                5, 10, 15, 20, 25, 30, 35, 40, 45, 50
            },{
                6, 12, 18, 24, 30, 36, 42, 48, 54, 60
            },{
                7, 14, 21, 28, 35, 42, 49, 56, 63, 70
            },{
                8, 16, 24, 32, 40, 48, 56, 64, 72, 80
            },{
                9, 18, 27, 36, 45, 54, 63, 72, 81, 90
            },{
                10, 20, 30, 40, 50, 60, 70, 80, 90, 100
            }
        } ;

        // given
        int[][] actual = MultiplicationTable.printMultiplicationTable(size);

        // then
        assertArrayEquals(expected, actual);
    }
}
