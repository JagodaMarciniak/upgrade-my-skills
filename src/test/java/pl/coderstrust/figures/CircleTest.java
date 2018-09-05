package pl.coderstrust.figures;

import org.junit.Test;
import org.junit.runners.Parameterized;


public class CircleTest {
@Parameterized.Parameters()
    @Test
    public void testCalculateArea() {
        //when
        Area area = new Circle(3);
        double expected = 28.26;
        //given

    }

    @Test
    public void getRadius() {
    }

    @Test
    public void setRadius() {
    }
}