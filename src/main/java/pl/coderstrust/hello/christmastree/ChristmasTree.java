package pl.coderstrust.hello.christmastree;

public class ChristmasTree {
    public static void main(String[] args) {
        treeSize(6);
    }

    public static void treeSize(int a) {

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < a - 1; i++) {
            System.out.print(" ");
        }
        for (int i = a - 2; i < a; i++) {
            System.out.print("*");
        }
    }
}