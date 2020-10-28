package com.codersbay.gerhofer;

public class Square extends Rectangle {

    public Square(Color color, boolean isFilled, double width, double length) {
        super(color, isFilled, width, length);
        if (width <= 0 || length <= 0) {
            throw new IllegalArgumentException("Sidelength cannot be 0 or negative");
        }
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }
}
