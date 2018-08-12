package pl.coderstrust.christmastree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChristmasTree {
    public static void main(String[] args) {
        List<String> christmasTree = getChristmasTree(5);
        for (String line : christmasTree) {
            System.out.println(line);
        }
    }

    public static List<String> getChristmasTree(int size) {
        if (size <= 0) {
            return new ArrayList<String>(Collections.singletonList("Invalid value"));
        }
        List<String> result = new ArrayList<String>();
        StringBuilder storage = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size - i; j++) {
                storage.append(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                storage.append("*");
            }
            result.add(storage.toString());
            storage.delete(0, storage.length());
        }

        for (int i = 0; i < size - 2; i++) {
            storage.append(" ");
        }
        storage.append("**");
        result.add(storage.toString());
        storage.delete(0, storage.length());
        return result;
    }
}