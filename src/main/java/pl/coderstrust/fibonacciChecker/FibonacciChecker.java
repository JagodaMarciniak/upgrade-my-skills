package pl.coderstrust.fibonacciChecker;

public class FibonacciChecker {

    public static void main(String[] args) {
        System.out.println(isFibonacciNumber(17711));
    }

    public static boolean isFibonacciNumber(long number) {
        if (number < 2) {
            return false;
        }
        long variant1 = recognizingFibNumFormula1(number);
        long variant2 = recognizingFibNumFormula2(number);
        return isperfectSquare(variant1) || isperfectSquare(variant2);
    }

    private static boolean isperfectSquare(long number) {
        int value = (int) Math.sqrt(number);
        if (value * value == number) {
            return true;
        }
        return false;
    }

    private static long recognizingFibNumFormula1(long number) {
        return number * number * 5 + 4;
    }

    private static long recognizingFibNumFormula2(long number) {
        return number * number * 5 - 4;
    }
}
