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

    @Test
    public void testCircleToString() {
        Circle c = new Circle("Circle", 3);
        assertTrue(c.toString().contains("radius=3"));
    }



    @Test
    public void testRhombusArea() {
        Rhombus r = new Rhombus("Rhombus", 4, 3);
        assertEquals(12, r.area(), EPSILON);
    }

    @Test
    public void testRhombusPerimeter() {
        Rhombus r = new Rhombus("Rhombus", 4, 3);
        assertEquals(16, r.perimeter(), EPSILON);
    }

    @Test
    public void testRhombusToString() {
        Rhombus r = new Rhombus("Rhombus", 4, 3);
        assertTrue(r.toString().contains("side=4"));
    }


    @Test
    public void testTriangleArea() {
        RightAngledTriangle t = new RightAngledTriangle("Triangle", 3, 4);
        assertEquals(6, t.area(), EPSILON);
    }

    @Test
    public void testTrianglePerimeter() {
        RightAngledTriangle t = new RightAngledTriangle("Triangle", 3, 4);
        assertEquals(12, t.perimeter(), EPSILON); // 3 + 4 + 5
    }

    @Test
    public void testTriangleToString() {
        RightAngledTriangle t = new RightAngledTriangle("Triangle", 3, 4);
        assertTrue(t.toString().contains("base=3"));
    }
}