package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CircleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void calculateArea() {
        //when

    }

    @Test
    @Parameters({"-1",
            "0", "-5"})
    public void shouldThrownIllegalArgumentException(double radius) {
        thrown.expect(IllegalArgumentException.class);
        new Circle(radius);
    }

    @Test
    @Parameters({"-1",
            "0", "-5"})
    public void testForSetterWithInvalidArgument(double radius) {
        //given
        Circle circle = new Circle();

       //when
        thrown.expect(IllegalArgumentException.class);
        circle.setRadius(radius);
    }


}