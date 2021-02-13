package oop.inheritance;

public class Square extends GeometricFigure{
private int side;

    public Square(int side) { //CONSTRUCTOR !!!
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
}
