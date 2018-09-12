package pl.coderstrust.numbersProcessor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Arrays;

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
    public void shouldProcessProvidedInputFileAndSaveResultToProvidedOutputFile() throws IOException, RuntimeException {
        // given
        when(fileProcessor.readLinesFromFile("src/main/resources/1000")).thenReturn(Arrays.asList("1 2 3", "4 5 6"));
        when(numbersProcessor.processLine("1 2 3")).thenReturn("1+2+3=6");
        doThrow(new Exception()).when(fileProcessor.writeLinesToFile(Arrays.asList("1+2+3=6", "4+5=9"), "1000out"));
        // when
        processor.process("src/main/resources/1000", "src/main/resources/1000out");

        // then
        verify(fileProcessor).readLinesFromFile("src/main/resources/1000");
        verify(numbersProcessor).processLine("1 2 3");
        verify(fileProcessor).writeLinesToFile(Arrays.asList("1+2+3=6", "4+5=9"), "1000out");
    }
}