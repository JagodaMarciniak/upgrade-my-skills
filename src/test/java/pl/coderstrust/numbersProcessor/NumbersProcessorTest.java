package pl.coderstrust.numbersProcessor;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class NumbersProcessorTest {
    private NumbersProcessor processor;

    @Before
    public void setUp() {
        processor = new NumbersProcessor();
    }

    public Object[] testConditions1() {
        return new Object[]{
                new Object[]{"2 445 78 ", "2+445+78=525"},
                new Object[]{"3456  ", "3456=3456"},
        };
    }

    @Test
    @Parameters(method = "testConditions1")
    public void testForDifferentLinesWithSpacesAndIntegers(String actual, String expected) {
        assertEquals(expected, processor.processLine(actual));
    }

    public Object[] testConditions2() {
        return new Object[]{
                new Object[]{"", ""},
                new Object[]{null, ""}
        };
    }

    @Test
    @Parameters(method = "testConditions2")
    public void testForNullAndEmptyLine(String actual, String expected) {
        assertEquals(expected, processor.processLine(actual));
    }
}