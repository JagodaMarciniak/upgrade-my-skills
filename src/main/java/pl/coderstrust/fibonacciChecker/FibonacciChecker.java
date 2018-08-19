package pl.coderstrust.fibonacciChecker;

import java.util.HashMap;
import java.util.Map;

public class FibonacciChecker {
    private static Map<Long, Boolean> cache = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(isFibonacciNumber(17711));
    }

    public static boolean isFibonacciNumber(long number) {
        if (number < 2) {
            return false;
        }
        if (cache.containsKey(number)) {
            return cache.get(number);
        }

        long variant1 = recognizingFibNumFormula(number, true);
        long variant2 = recognizingFibNumFormula(number, false);
        boolean result = isperfectSquare(variant1) || isperfectSquare(variant2);
        cache.put(number, result);
        return result;
    }

    private static boolean isperfectSquare(long number) {
        int value = (int) Math.sqrt(number);
        return value * value == number;
    }

    private static long recognizingFibNumFormula(long number, boolean plus) {
        long value = number * number * 5;
        long offset = 4;
        return plus ? value + offset : value - offset;
    }
}
