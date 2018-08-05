package pl.coderstrust.fibonacci;

public class FibonacciIterative {
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }

    private static long fibonacci(int fibonacciNumberInOrder) {
        int actualValue = 0;
        int previousValue = 1;
        for (int i = 0; i < fibonacciNumberInOrder; i++) {
            previousValue += actualValue;
            actualValue = previousValue - actualValue;
        }
        return actualValue;
    }
}
