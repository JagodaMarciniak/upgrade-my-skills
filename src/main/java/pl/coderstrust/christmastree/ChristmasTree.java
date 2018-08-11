package pl.coderstrust.christmastree;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTree {
    public static void main(String[] args) {
        System.out.println(printChristmasTree(0));
    }

    public static List<String> printChristmasTree(int height) {
        List<String> result = new ArrayList<String>();
        StringBuilder storage = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                storage.append(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                storage.append("*");
            }
            storage.append("\n ");
        }
        for (int i = 0; i < height - 1; i++) {
            storage.append(" ");
        }
        storage.append("**");
        result.add(storage.toString());
        return result;
    }
}