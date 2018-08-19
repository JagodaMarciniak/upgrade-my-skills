package pl.coderstrust.fibonacciChecker;

import java.util.HashSet;
import java.util.Set;

public class FibonacciChecker {
    private static Set<Long> cacheTrue = new HashSet<>();
    private static Set<Long> cacheFalse = new HashSet<>();

    public static void main(String[] args) {
        System.out.println(isFibonacciNumber(17711));
    }

    public static boolean isFibonacciNumber(long number) {
        if (cacheTrue.contains(number)) {
            return true;
        }
        if (cacheFalse.contains(number)) {
            return false;
        }
        if (nocacheIsFibonacciNumber(number)) {
            cacheTrue.add(number);
            return true;
        } else {
            cacheFalse.add(number);
            return false;
        }
    }

    private static boolean nocacheIsFibonacciNumber(long number) {
        if (number < 2) {
            return false;
        }
        long variant1 = recognizingFibNumFormula(number, true);
        long variant2 = recognizingFibNumFormula(number, false);

        return isPerfectSquare(variant1) || isPerfectSquare(variant2);
    }

    private static boolean isPerfectSquare(long number) {
        int value = (int) Math.sqrt(number);
        return value * value == number;
    }

    private static long recognizingFibNumFormula(long number, boolean plus) {
        long value = number * number * 5;
        long offset = 4;
        return plus ? value + offset : value - offset;
    }
}
