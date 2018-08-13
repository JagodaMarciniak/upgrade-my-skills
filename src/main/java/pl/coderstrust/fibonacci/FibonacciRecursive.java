package pl.coderstrust.fibonacci;

public class FibonacciRecursive {
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }

    private static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder < 2) {
            return fibonacciNumberInOrder;
        } else { return fibonacci(fibonacciNumberInOrder - 1)
                    + fibonacci(fibonacciNumberInOrder - 2);
        }
    }
}
