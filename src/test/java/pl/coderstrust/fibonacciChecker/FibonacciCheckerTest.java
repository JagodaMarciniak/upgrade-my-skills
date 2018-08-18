package pl.coderstrust.fibonacciChecker;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FibonacciCheckerTest {
    @Test
    public void testNumberOfZero() {
        //given
        int number = 0;
        boolean expected = false;

        //when
        boolean result = FibonacciChecker.isFibonacciNumber(number);

        //then
        assertFalse(result);
    }

    @Test
    public void testNegativeNumber() {
        //given
        int number = -10;
        boolean expected = false;

        //when
        boolean result = FibonacciChecker.isFibonacciNumber(number);

        //then
        assertFalse(result);
    }

    @Test
    public void testNumberOf17711() {
        //given
        long number = 17711;
        boolean expected = true;

        //when
        boolean result = FibonacciChecker.isFibonacciNumber(number);

        //then
        assertTrue(result);
    }
}
