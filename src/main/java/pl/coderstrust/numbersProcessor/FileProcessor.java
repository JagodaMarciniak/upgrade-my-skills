package pl.coderstrust.numbersProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {

    public List<String> readLinesFromFile(String filename) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(filename);
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        return list;
    }
}
