package pl.coderstrust.numbersProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {
    public List<String> readLinesFromFile(String filepath) {
        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(filepath);
        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }
        scanner.close();
        return lines;
    }

    public void writeLinesToFile(List<String> lines, String filename) {

    }
}
