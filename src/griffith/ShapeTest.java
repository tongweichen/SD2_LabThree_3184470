package griffith;

//Name: Tongwei Chen  Student Number: 3184470,This class contains unit tests and an integration test for Circle, Rhombus and RightAngledTriangle classes.

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

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
        assertEquals(12, t.perimeter(), EPSILON); 
    }

    @Test
    public void testTriangleToString() {
        RightAngledTriangle t = new RightAngledTriangle("Triangle", 3, 4);
        assertTrue(t.toString().contains("base=3"));
    }


    @Test
    public void testIntegrationShapesList() {

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle("Circle", 3));
        shapes.add(new Circle("Circle", 5));

        shapes.add(new Rhombus("Rhombus", 4, 3));
        shapes.add(new Rhombus("Rhombus", 2.5, 4));

        shapes.add(new RightAngledTriangle("Triangle", 3, 4));
        shapes.add(new RightAngledTriangle("Triangle", 6, 8));

        ArrayList<Double> expectedAreas = new ArrayList<>();
        ArrayList<Double> expectedPerimeters = new ArrayList<>();

        expectedAreas.add(Math.PI * 9);
        expectedPerimeters.add(2 * Math.PI * 3);

        expectedAreas.add(Math.PI * 25);
        expectedPerimeters.add(2 * Math.PI * 5);

        expectedAreas.add(12.0);
        expectedPerimeters.add(16.0);

        expectedAreas.add(10.0);
        expectedPerimeters.add(10.0);

        expectedAreas.add(6.0);
        expectedPerimeters.add(12.0);

        expectedAreas.add(24.0);
        expectedPerimeters.add(24.0);

        for (int i = 0; i < shapes.size(); i++) {
            assertEquals(expectedAreas.get(i), shapes.get(i).area(), EPSILON);
            assertEquals(expectedPerimeters.get(i), shapes.get(i).perimeter(), EPSILON);
        }
    }
}