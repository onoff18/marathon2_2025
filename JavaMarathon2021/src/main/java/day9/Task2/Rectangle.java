package day9.Task2;

public class Rectangle extends Figure {

    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB, String color) {
        super.setColor(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideB * sideA;
    }

    @Override
    public double perimeter() {
        return 2 * (sideB + sideA);
    }
}
