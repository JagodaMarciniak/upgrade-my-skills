package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import java.util.Objects;

import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class SquareTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testForCalculateArea() {
        //when
        Square square = new Square(10.2);

        //given
        double expected = 10.2 * 10.2;
        double actual = square.calculateArea();

        //then
        assertTrue(Objects.equals(expected, actual));
    }

    @Test
    @Parameters({"-1.0",
            "0.0", "-5.2"})
    public void testForConstructorWithInvalidValue(double side) {
        thrown.expect(IllegalArgumentException.class);
        new Square(side);
    }

    @Test
    @Parameters({"-1.3",
            "0.0", "-5.9"})
    public void testForSetSide(double side) {
        //given
        Square square = new Square();

        //when
        thrown.expect(IllegalArgumentException.class);
        square.setSide(side);
    }

}
