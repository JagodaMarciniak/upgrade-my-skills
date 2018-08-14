package pl.coderstrust;

public class FibonacciChecker {

    public static void main(String[] args) {
        isFibonacciNumber(377);
    }

    public static boolean isFibonacciNumber(long number) {
        long recognizingPerfectSquareFormula1 = number * number * 5 + 4;
        long recognizingPerfectSquareFormula2 = number * number * 5 - 4;
        double perfectSquareVariant1 = Math.sqrt(recognizingPerfectSquareFormula1);
        double perfectSquareVariant2 = Math.sqrt(recognizingPerfectSquareFormula2);
        if ((int) perfectSquareVariant1 * (int) perfectSquareVariant1 == recognizingPerfectSquareFormula1
                || (int) perfectSquareVariant2 * (int) perfectSquareVariant2 == recognizingPerfectSquareFormula2) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

}
