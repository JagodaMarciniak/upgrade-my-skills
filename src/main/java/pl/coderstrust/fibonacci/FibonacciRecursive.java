package pl.coderstrust.fibonacci;

public class FibonacciRecursive {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    private static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder <= 0) {
            return 0;
        } else if (fibonacciNumberInOrder == 1) {
            return 1;
        } else {
            return fibonacci(fibonacciNumberInOrder - 1)
                    + fibonacci(fibonacciNumberInOrder - 2);
        }
    }
}
