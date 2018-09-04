package pl.coderstrust.numbersProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersProcessor {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("23455" +
                "232");
        processLine(list);
    }

    public static void processLine(List<String> list) {
        StringBuilder storage = new StringBuilder();
        Scanner scanner = new Scanner(String.valueOf(list));
        while (scanner.hasNextLine()) {
            storage.append(scanner.nextLine());
            System.out.println(storage);
        }
    }

    private boolean isLineValid(List<String> line) {
        if (line == null) {
            return false;
        }
        if (line ==)
    }
}
