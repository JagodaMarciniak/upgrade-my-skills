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

    public Object[] testConditions() {
        return new Object[]{
                new Object[]{"2 445 78 ", "2+445+78=525"},
                new Object[]{"3456  ", "3456=3456"},
                new Object[]{"", ""},
                new Object[]{null, ""},
                new Object[]{"A", ""},
                new Object[]{"3+4", ""},
                new Object[]{"     ", ""},

        };
    }

    @Test
    @Parameters(method = "testConditions")
    public void testForDifferentLinesForNullAndEmptyLines(String actual, String expected) {
        assertEquals(expected, processor.processLine(actual));
    }
}