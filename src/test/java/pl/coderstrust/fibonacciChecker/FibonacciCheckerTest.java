package pl.coderstrust.fibonacciChecker;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class FibonacciCheckerTest {
    @Parameters({"0, false",
            "-10, false",
            "50, false",
            "2, true",
            "4, false",
            "5, true",
            "10, false",
            "13, true",
            "15, false"
    })
    @Test
    public void testFiboChecker(int number, boolean expected) {
        //when
        boolean result = FibonacciChecker.isFibonacciNumber(number);

        //then
        assertThat(result, is(expected));
    }
}
