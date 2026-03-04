package griffith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShapeTest {

    private static final double EPSILON = 0.1;

    @Test
    public void testCircleArea() {
        Circle c = new Circle("Circle", 3);
        assertEquals(Math.PI * 9, c.area(), EPSILON);
    }

    @Test
    public void testCirclePerimeter() {
        Circle c = new Circle("Circle", 3);
        assertEquals(2 * Math.PI * 3, c.perimeter(), EPSILON);
    }
}