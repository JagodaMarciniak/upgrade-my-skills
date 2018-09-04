package pl.coderstrust.numbersProcessor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("1000"));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }

//    public void readLinesFromFile(String filename) {
//        filename = "primes";
//        Scanner scanner = new Scanner(filename);
//        while (scanner.hasNextLine()) {
//            scanner.nextLine();
//        }
//    }
}
