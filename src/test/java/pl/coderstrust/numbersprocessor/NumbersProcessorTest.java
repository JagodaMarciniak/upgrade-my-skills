package pl.coderstrust.numbersprocessor;

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

    public Object[] argumentsForCorrectBehaviour() {
        return new Object[]{
                new Object[]{"2 445 78 ", "2+445+78=525"},
                new Object[]{"3456  ", "3456=3456"},
                new Object[]{"1 2 3 4", "1+2+3+4=10"},
                new Object[]{" 1 2 3", "1+2+3=6"},
                new Object[]{"1 g 5 sd 65fg", ""},
                new Object[]{"", ""},
                new Object[]{null, ""},
                new Object[]{"A", ""},
                new Object[]{"1 # $ 4 2 ! n", ""},
                new Object[]{"3+4", ""},
                new Object[]{"     ", ""},
        };
    }

    @Test
    @Parameters(method = "argumentsForCorrectBehaviour")
    public void testForCorrectBehaviour(String actual, String expected) {
        String given = processor.processLine(actual);
        assertEquals(expected, given);
    }
}
