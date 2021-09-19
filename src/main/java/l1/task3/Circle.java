package l1.task3;

public class Circle extends Shape {
    private double radius;
    private double perimeter = calcPerimeter();
    private double square = calcSquare();

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcSquare() {
        return radius * radius * Math.PI;
    }

    @Override
    public double calcPerimeter() {
        return 2 * radius * Math.PI;
    }
}
