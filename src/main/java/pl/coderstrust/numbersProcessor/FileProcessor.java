package pl.coderstrust.numbersProcessor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {

    public List<String> readLinesFromFile(String filepath) throws FileNotFoundException {
        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filepath));
        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }
        scanner.close();
        return lines;
    }

    public void writeLinesToFile(List<String> lines, String fileName) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(fileName));
        for (String line : lines) {
            printWriter.println(line);
        }
        printWriter.close();
    }
}
