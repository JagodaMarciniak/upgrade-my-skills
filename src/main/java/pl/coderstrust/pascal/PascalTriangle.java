package pl.coderstrust.pascal;

import java.util.Scanner;

public class PascalTriangle {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle : ");
        printPascalTriangle(input.nextInt());
    }

    public static void printPascalTriangle(int height) {
        for (int i = 0; i < height; i++) {
            int number = 1;
            printSpacesForRow(i, height);
            for (int j = 0; j <= i; j++) {
                System.out.printf("%5d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    private static void printSpacesForRow(int rowNumber, int height) {
        for (int i = 0; i < (height - rowNumber) * 2; i++) {
            System.out.print(" ");
        }
    }
}