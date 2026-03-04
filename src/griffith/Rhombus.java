package griffith;


public class Rhombus extends Shape {

    private double side;
    private double height;

    public Rhombus(String name, double side, double height) {
        super(name);
        this.side = side;
        this.height = height;
    }

    @Override
    public double area() {
        return side * height;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return super.toString() + " side=" + side + " height=" + height;
    }
}