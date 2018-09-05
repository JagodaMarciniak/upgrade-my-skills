package pl.coderstrust.numbersProcessor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersProcessorTest {

    @Test
    public void testIntegersWithSpaces() {
        //when
        String line = "2 445 78 ";
        String expected = "2+445+78=525";
        //given
        String actual = new NumbersProcessor().processLine(line);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testIntegersWithoutSpaces() {
        //when
        String line = "244578";
        String expected = "244578=244578";
        //given
        String actual = new NumbersProcessor().processLine(line);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        //when
        String line = "244578";
        String expected = "244578=244578";
        //given
        String actual = new NumbersProcessor().processLine(line);
        //then
        assertEquals(expected, actual);
    }
}