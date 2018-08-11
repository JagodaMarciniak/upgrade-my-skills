package pl.coderstrust.christmastree;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTree {
    public static void main(String[] args) {
        printChristmasTree(6);
    }

    public static void printChristmasTree(int height) {
        List<String> result = new ArrayList<String>();
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
        System.out.print("**");
    }
}