package pl.coderstrust.numbersProcessor;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileProcessor fileprocessor = new FileProcessor();
        NumbersProcessor numberprocessor = new NumbersProcessor();
        Processor procesor = new Processor(numberprocessor, fileprocessor);
        procesor.process("src/main/resources/1000", "src/main/resources/1000out");
    }
}
