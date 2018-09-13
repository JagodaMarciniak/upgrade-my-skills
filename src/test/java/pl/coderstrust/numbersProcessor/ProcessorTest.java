package pl.coderstrust.numbersProcessor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Arrays;

import static org.mockito.Matchers.anyList;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class ProcessorTest {

    @Mock
    private NumbersProcessor numbersProcessor;
    @Mock
    private FileProcessor fileProcessor;

    @InjectMocks
    private Processor processor;

    @Test
    public void shouldProcessProvidedInputFileAndSaveResultToProvidedOutputFile() throws IOException {
        // given
        String inputFile = "src/main/resources/1000";
        when(fileProcessor.readLinesFromFile(inputFile)).thenReturn(Arrays.asList("1 2 3", "4 5 6"));
        when(numbersProcessor.processLine("1 2 3")).thenReturn("1+2+3=6");
        when(numbersProcessor.processLine("4 5 6")).thenReturn("4+5+6=15");
        doNothing().when(fileProcessor).writeLinesToFile(anyList(), anyString());

        // when
        processor.process("src/main/resources/1000", "src/main/resources/1000out");

        // then
        verify(fileProcessor).readLinesFromFile(inputFile);
        verify(numbersProcessor).processLine("1 2 3");
        verify(fileProcessor).writeLinesToFile(Arrays.asList("1+2+3=6", "4+5+6=15"), "src/main/resources/1000out");
    }
}