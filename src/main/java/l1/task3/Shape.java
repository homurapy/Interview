package l1.task3;

abstract class Shape implements Squarable,Perimeterable {
    private double perimeter;
    private double square;

    public void draw(){
        System.out.println("Фигура отрисована");
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

}
