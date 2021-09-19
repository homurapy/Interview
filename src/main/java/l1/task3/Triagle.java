package l1.task3;

public class Triagle extends Shape {
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private double perimeter=calcPerimeter();
    private double square=calcSquare();

    public Triagle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double calcPerimeter() {
        double p = (firstSide+secondSide+thirdSide)/2;
        return Math.sqrt(p*(p-firstSide)*(p-secondSide)*(p-thirdSide));
    }

    @Override
    public double calcSquare() {
        return firstSide+secondSide+thirdSide;
    }
}
