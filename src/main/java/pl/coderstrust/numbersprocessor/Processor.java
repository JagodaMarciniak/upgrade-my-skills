package pl.coderstrust.numbersprocessor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Processor {
    private NumbersProcessor numbersProcessor;
    private FileProcessor fileProcessor;

    public Processor(NumbersProcessor numbersProcessor, FileProcessor fileProcessor) {
        if (numbersProcessor == null) {
            throw new IllegalArgumentException("Parameter cannot be null.");
        }
        if (fileProcessor == null) {
            throw new IllegalArgumentException("Parameter cannot be null.");
        }
        this.numbersProcessor = numbersProcessor;
        this.fileProcessor = fileProcessor;
    }

    public void process(String inputFilePath, String outputFilePath) throws IOException {
        if (outputFilePath == null) {
            throw new IllegalArgumentException("Output File Path cannot be null.");
        }
        if (inputFilePath == null) {
            throw new IllegalArgumentException("Input File Path cannot be null.");
        }
        List<String> linesFromFile = fileProcessor.readLinesFromFile(inputFilePath);
        List<String> resultLines = new ArrayList<>();
        for (String line : linesFromFile) {
            resultLines.add(numbersProcessor.processLine(line));
        }
        fileProcessor.writeLinesToFile(resultLines, outputFilePath);
    }
}
