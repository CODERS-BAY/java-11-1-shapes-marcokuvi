package com.codersbay.gerhofer;

public class Square extends Shape {

    private double sideLength;

    public Square(Colors color, boolean isFilled, double sideLength) {
        super(color, isFilled);
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Sidelength cannot be 0 or negative");
        } else {
            this.sideLength = sideLength;
        }
    }

    @Override
    public double getArea() {
        double area = this.sideLength * this.sideLength;
        return area;
    }

    @Override
    public double getPerimeter() {
        double scope = this.sideLength * 4;
        return scope;
    }
}
