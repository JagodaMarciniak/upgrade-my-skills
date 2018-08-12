package pl.coderstrust.multiplication;

public class MultiplicationTable {
    public static void main(String[] args) {

        printMultiplicationTable(12);
    }

    public static void printMultiplicationTable(int size) {
        System.out.print("  ");
        for (int j = 1; j <= size; j++) {
            System.out.printf("%4d", j);
        }
        System.out.println();
        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d", i);

            for (int j = 1; j <= size; j++) {
                int multi = i * j;
                System.out.printf("%4d", multi);
            }
            System.out.println();
        }
    }
}
