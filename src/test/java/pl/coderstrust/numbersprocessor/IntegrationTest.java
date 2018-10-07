package pl.coderstrust.numbersprocessor;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class IntegrationTest {
    private static final String OUTPUT_FILE = "src/test/resources/outputFile";

    @Before
    public void before() {
        File file = new File(OUTPUT_FILE);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    public void testForCorrectBehavior() throws IOException {
        // given
        String inputFile = "src/test/resources/inputFile";
        String expectedFile = "src/test/resources/expectedFile";

        NumbersProcessor numbersProcessor = new NumbersProcessor();
        FileProcessor fileProcessor = new FileProcessor();
        Processor processor = new Processor(numbersProcessor, fileProcessor);

        // when
        processor.process(inputFile, OUTPUT_FILE);
        File actual = new File(OUTPUT_FILE);
        File expected = new File(expectedFile);

        //then
        assertTrue(FileUtils.contentEquals(actual, expected));
    }
}
