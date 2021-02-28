package oop.advanced.interfaces;

public class Rectangle implements Shape, OtherShape{
    private double lenght;
    private double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width*lenght;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+lenght);
    }

    @Override
    public void print() {
        System.out.println("Inside rectangle");
    }

    @Override
    public String
    toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                '}';
    }
}
