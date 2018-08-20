package pl.coderstrust.fibonacciChecker;

import java.util.HashMap;
import java.util.Map;

public class FibonacciChecker {
    private static Map<Long, Boolean> cache = new HashMap();

    public static void main(String[] args) {
        System.out.println(isFibonacciNumber(17711));
    }

    public static boolean isFibonacciNumber(long number) {
        if (cache.containsKey(number)) {
            return cache.get(number);
        } else {
            boolean result = IsFibonacciNumber(number);
            cache.put(number, result);
            return result;
        }
    }

    private static boolean IsFibonacciNumber(long number) {
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
