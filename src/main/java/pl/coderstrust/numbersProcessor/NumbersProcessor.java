package pl.coderstrust.numbersProcessor;

import java.util.Scanner;

public class NumbersProcessor {

    public String processLine(String line) {
        if (!isLineValid(line)) {
            return "";
        }
        StringBuilder storage = new StringBuilder();
        Scanner scanner = new Scanner(line);
        int sum = 0;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            storage.append(number);
            sum += number;
            if (scanner.hasNextInt()) {
                storage.append("+");
            }
        }
        storage.append("=").append(sum);
        return storage.toString();
    }

    private static boolean isLineValid(String line) {
        if (line == null || line.trim().isEmpty()) {
            return false;
        }
        return line.matches("[\\d\\s]+");
    }
}
