package pl.coderstrust.multiplicationTable;

public class MultiplicationTable {
    public static void main(String[] args) {
        printTable(12);
    }

    public static void printTable(int size) {
        System.out.print("  ");
        for (int j = 1; j <= size; j++) {
            if (j < 10) {
                System.out.printf("   %d", j);
            }
            if (j >= 10) {
                System.out.printf("  %d\n", j);
            }
        }
        System.out.println();
        for (int i = 1; i <= size; i++) {
            if (i > 9) {
                System.out.print(i);
            } else {
                System.out.printf(" %d\n", i);
            }
            for (int j = 1; j <= size; j++) {
                if (i * j < 10) {
                    System.out.print("   " + i * j);
                }
                if (i * j >= 10 && i * j < 100) {
                    System.out.print("  " + i * j);
                }
                if (i * j >= 100) {
                    System.out.print(" " + i * j);
                }
            }
            System.out.println();
        }
    }
}
