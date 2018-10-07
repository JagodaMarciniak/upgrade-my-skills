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
public class RectangleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void calculateArea() {
        //when
        Rectangle rectangle = new Rectangle(2, 3);

        //given
        double expected = 6;
        double actual = rectangle.calculateArea();

        //then
        assertTrue(Objects.equals(expected, actual));
    }

    @Test
    @Parameters({"-1", "0", "-5"})
    public void testForSetAreaWithInvalidArgument(double area) {
        //given
        Rectangle rectangle = new Rectangle();

        //when
        thrown.expect(IllegalArgumentException.class);
        rectangle.setArea(area);
    }

    @Test
    @Parameters({"-1", "0", "-5"})
    public void testForConstructorWithInvalidValueHeight(double height) {
        thrown.expect(IllegalArgumentException.class);
        new Rectangle(height);
    }

    @Test
    @Parameters({"-1", "0", "-5"})
    public void testForConstructorWithInvalidValueWidth(double width) {
        thrown.expect(IllegalArgumentException.class);
        new Rectangle(width);
    }

    @Test
    @Parameters({"-1", "0", "-5"})
    public void testForSetWidthWithInvalidArgument(double width) {
        //given
        Rectangle rectangle = new Rectangle();

        //when
        thrown.expect(IllegalArgumentException.class);
        rectangle.setWidth(width);
    }

    @Test
    @Parameters({"-1", "0", "-5"})
    public void testForSetHeightWithInvalidArgument(double height) {
        //given
        Rectangle rectangle = new Rectangle();

        //when
        thrown.expect(IllegalArgumentException.class);
        rectangle.setHeight(height);
    }
}
