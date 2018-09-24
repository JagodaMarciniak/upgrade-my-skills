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
public class CircleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void calculateArea() {
        //when
        Circle circle = new Circle(10);

        //given
        double expected = Math.PI * 100;
        double actual = circle.calculateArea();

        //then
        assertTrue(Objects.equals(expected, actual));
    }

    @Test
    @Parameters({"-1",
            "0", "-5"})
    public void testForConstructorWithInvalidValue(double radius) {
        thrown.expect(IllegalArgumentException.class);
        new Circle(radius);
    }

    @Test
    @Parameters({"-1",
            "0", "-5"})
    public void testForSetInvalidArgument(double radius) {
        //given
        Circle circle = new Circle();

        //when
        thrown.expect(IllegalArgumentException.class);
        circle.setRadius(radius);
    }
}