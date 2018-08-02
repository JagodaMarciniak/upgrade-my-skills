package pl.coderstrust.fibonacci;

public class FibonacciIterative {
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }

    private static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder <= 1) {
            return fibonacciNumberInOrder;
        }
        int fib = 1;
        int prevFib = 1;
        for (int i = 2; i < fibonacciNumberInOrder; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }
}
