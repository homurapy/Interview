package l1.task3;

public class Square extends Shape implements Squarable, Perimeterable{
    private double side;
    private double perimeter = calcPerimeter();
    private double square = calcSquare();

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calcPerimeter() {
        return side*side;
    }

    @Override
    public double calcSquare() {
        return side*4;
    }
}
