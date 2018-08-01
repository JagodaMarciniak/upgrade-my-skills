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
                System.out.printf("  %d", j);
            }
        }
        System.out.println();
        for (int i = 1; i <= size; i++) {
            if (i > 9) {
                System.out.print(i);
            } else {
                System.out.printf(" %d", i);
            }
            for (int j = 1; j <= size; j++) {
                int multi = i * j;
                if (multi < 10) {
                    System.out.printf("   %d", multi);
                }
                if (multi >= 10 && multi < 100) {
                    System.out.printf("  %d", multi);
                }
                if (multi >= 100) {
                    System.out.printf(" %d", multi);
                }
            }
            System.out.println();
        }
    }
}