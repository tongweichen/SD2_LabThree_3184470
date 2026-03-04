package griffith;

public class RightAngledTriangle extends Shape {

    private double base;
    private double height;

    public RightAngledTriangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", base=" + base +
                ", height=" + height;
    }
}