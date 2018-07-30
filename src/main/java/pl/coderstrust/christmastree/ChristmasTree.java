package pl.coderstrust.christmastree;

public class ChristmasTree {
    public static void main(String[] args) {
        printChristmasTree(6);
    }

    public static void printChristmasTree(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < height - 1; i++) {
            System.out.print(" ");
        }
        for (int i = height - 2; i < height; i++) {
            System.out.print("*");
        }
    }
}