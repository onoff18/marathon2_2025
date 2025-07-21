package day9.Task2;

public class Circle extends Figure {

    private final double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        super.setColor(color);
    }

    @Override
    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double perimeter() {
        return radius * Math.PI * 2;
    }
}
