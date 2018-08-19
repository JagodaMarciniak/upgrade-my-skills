package pl.coderstrust.fibonacciChecker;

public class FibonacciChecker {

    public static void main(String[] args) {
        System.out.println(isFibonacciNumber(17711));
    }

    public static boolean isFibonacciNumber(long number) {
        if (number < 2) {
            return false;
        }

        long variant1 = recognizingFibNumFormula(number, true);
        long variant2 = recognizingFibNumFormula(number, false);
        return isperfectSquare(variant1) || isperfectSquare(variant2);
    }

    private static boolean isperfectSquare(long number) {
        int value = (int) Math.sqrt(number);
        return value * value == number;
    }

    private static long recognizingFibNumFormula(long numer, boolean plus) {
        long value = numer * numer * 5;
        long offset = 4;
        return plus ? value + offset : value - offset;
    }
}
