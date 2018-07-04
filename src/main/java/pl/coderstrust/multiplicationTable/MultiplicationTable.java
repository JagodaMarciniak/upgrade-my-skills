package pl.coderstrust.multiplicationTable;

public class MultiplicationTable {
    public static void main(String[] args) {
        multiplicationTableSize(12);
    }

    public static void multiplicationTableSize(int a) {
        System.out.print("  ");
        for (int j = 1; j <= a; j++) {
            if (j < 10) {
                System.out.print("   " + j);
            }
            if (j >= 10) {
                System.out.print("  " + j);
            }
        }
        System.out.println();
        for (int i = 1; i <= a; i++) {
            if (i > 9) {
                System.out.print(i);
            } else {
                System.out.print(" " + i);
            }
            for (int j = 1; j <= a; j++) {
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
