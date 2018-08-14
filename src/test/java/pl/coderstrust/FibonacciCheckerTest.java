package pl.coderstrust;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FibonacciCheckerTest {
    @Test
    public void testNumberOfZero() {
        //given
        int number = 0;

        //when
        boolean expected = FibonacciChecker.isFibonacciNumber(number);

        //then
        assertFalse(expected);
    }

    @Test
    public void testNegativeNumber() {
        //given
        int number = -10;

        //when
        boolean expected = FibonacciChecker.isFibonacciNumber(number);

        //then
        assertFalse(expected);
    }

    @Test
    public void testNumberOfTwentyOne() {
        //given
        int number = 21;

        //when
        boolean expected = FibonacciChecker.isFibonacciNumber(number);

        //then
        assertTrue(expected);
    }

    @Test
    public void testNumberOfTwoHundredAndThirtyThree() {
        //given
        long number = 233;

        //when
        boolean expected = FibonacciChecker.isFibonacciNumber(number);

        //then
        assertTrue(expected);
    }
}
