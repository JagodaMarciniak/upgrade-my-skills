package pl.coderstrust.foobar;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class FooBarTest {
    @Test
    public void testSizeOfZero() {
        //Given
        int size = 1;
        List<String> expected = new ArrayList<String>();
        expected.add("0 FooBar");

        //When
        List<String> actual = FooBar.getFooBar(size);

        //Then
        assertTrue(expected.equals(actual));
    }

    @Test
    public void testSizeOfTen() {
        //Given
        int size = 10;
        List<String> expected = new ArrayList<String>();
        expected.add("0 FooBar");
        expected.add("1 ");
        expected.add("2 ");
        expected.add("3 Foo");
        expected.add("4 ");
        expected.add("5 Bar");
        expected.add("6 Foo");
        expected.add("7 ");
        expected.add("8 ");
        expected.add("9 Foo");

        //When
        List<String> actual = FooBar.getFooBar(size);

        //Then
        assertTrue(expected.equals(actual));
    }

    @Test
    public void testNegativeSize() {
        //Given
        int size = -5;
        List<String> expected = new ArrayList(Collections.singletonList("Invalid value"));

        //When
        List<String> actual = FooBar.getFooBar(size);

        //Then
        assertTrue(expected.equals(actual));
    }
}
