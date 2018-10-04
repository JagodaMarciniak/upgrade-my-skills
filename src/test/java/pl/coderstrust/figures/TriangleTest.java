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
public class TriangleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void calculateArea() {
        //when
        Triangle triangle = new Triangle(2.0, 3.4);

        //given
        double expected = 3.4 * 2.0 / 2;
        double actual = triangle.calculateArea();

        //then
        assertTrue(Objects.equals(expected, actual));
    }

    @Test
    @Parameters({"-1",
            "0", "-5"})
    public void testForSetInvalidArgumentsHeight(double height) {
        Triangle triangle = new Triangle();

        //when
        thrown.expect(IllegalArgumentException.class);
        triangle.setHeight(height);
    }

    @Test
    @Parameters({"-1",
            "0", "-5"})
    public void testForSetInvalidArgumentsBase(double base) {
        //given
        Triangle triangle = new Triangle();

        //when
        thrown.expect(IllegalArgumentException.class);
        triangle.setHeight(base);
    }

    @Test
    @Parameters({"-1",
            "0", "-5"})
    public void testForSetInvalidArgumentsArea(double area) {
        //given
        Triangle triangle = new Triangle();

        //when
        thrown.expect(IllegalArgumentException.class);
        triangle.setHeight(area);
    }

    @Test
    @Parameters({"-1",
            "0", "-5"})
    public void testForConstructorWithInvalidValueHeight(double height) {
        thrown.expect(IllegalArgumentException.class);
        new Triangle(height);
    }

    @Test
    @Parameters({"-1",
            "0", "-5"})
    public void testForConstructorWithInvalidValueBase(double base) {
        thrown.expect(IllegalArgumentException.class);
        new Triangle(base);
    }
}
