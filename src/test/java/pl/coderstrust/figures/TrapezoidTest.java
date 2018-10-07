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
public class TrapezoidTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testForCalculateArea() {
        //when
        Trapezoid trapezoid = new Trapezoid(2.0, 4.2, 3.7);

        //given
        double expected = 2.0 * (4.2 + 3.7) / 2;
        double actual = trapezoid.calculateArea();

        //then
        assertTrue(Objects.equals(expected, actual));
    }

    @Test
    @Parameters({"-1", "0", "-5"})
    public void testForConstructorWithInvalidValueHeight(double height) {
        thrown.expect(IllegalArgumentException.class);
        new Trapezoid(height);
    }

    @Test
    @Parameters({"-1", "0", "-5"})
    public void testForConstructorWithInvalidValueSideA(double sideA) {
        thrown.expect(IllegalArgumentException.class);
        new Trapezoid(sideA);
    }

    @Test
    @Parameters({"-1", "0", "-5"})
    public void testForConstructorWithInvalidValueSideB(double sideB) {
        thrown.expect(IllegalArgumentException.class);
        new Trapezoid(sideB);
    }

    @Test
    @Parameters({"-1.3", "0.0", "-5.2"})
    public void testForSetHeightWithInvalidArguments(double height) {
        //given
        Trapezoid trapezoid = new Trapezoid();

        //when
        thrown.expect(IllegalArgumentException.class);
        trapezoid.setHeight(height);
    }

    @Test
    @Parameters({"-1.3", "0.0", "-5.2"})
    public void testForSetSideAWithInvalidArguments(double sideA) {
        //given
        Trapezoid trapezoid = new Trapezoid();

        //when
        thrown.expect(IllegalArgumentException.class);
        trapezoid.setHeight(sideA);
    }

    @Test
    @Parameters({"-1.3", "0.0", "-5.2"})
    public void testForSetSideBWithInvalidArguments(double sideB) {
        //given
        Trapezoid trapezoid = new Trapezoid();

        //when
        thrown.expect(IllegalArgumentException.class);
        trapezoid.setHeight(sideB);
    }

    @Test
    @Parameters({"-1.3", "0.0", "-5.2"})
    public void testForSetAreaWithInvalidArguments(double area) {
        //given
        Trapezoid trapezoid = new Trapezoid();

        //when
        thrown.expect(IllegalArgumentException.class);
        trapezoid.setHeight(area);
    }
}
