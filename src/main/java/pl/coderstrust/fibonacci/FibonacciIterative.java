package pl.coderstrust.fibonacci;

public class FibonacciIterative {
    public static void main(String[] args) {
        System.out.println(fibonacci(-1));
        System.out.println(fibonacci(8));
    }

    private static long fibonacci(int fibonacciNumberInOrder) {
        int rightFibNumber = 0;
        int previousFibNumber = 1;
        for (int i = 0; i < fibonacciNumberInOrder; i++) {
            int temp = rightFibNumber;
            rightFibNumber += previousFibNumber;
            previousFibNumber = temp;
        }
        return rightFibNumber;
    }
}
