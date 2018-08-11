package pl.coderstrust.christmastree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class ChristmasTreeTest {

    @Test
    public void shouldTestprintChristmasTreeWithZeroValue() {
//        when
        int size = -5;
        List<String> expected = new ArrayList<String>(Collections.singletonList("Invalid value"));
//        given
        List<String> actual = new ArrayList<String>(ChristmasTree.printChristmasTree(size));
//        then
        assertTrue(expected.equals(actual));
    }
}