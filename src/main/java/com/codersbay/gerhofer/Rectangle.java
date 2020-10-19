package com.codersbay.gerhofer;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(Colors color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        if (width <= 0 || length <= 0) {
            throw new IllegalArgumentException("Width or Length cannot be 0 or negative");
        } else {
            this.width = width;
            this.length = length;
        }
    }

    @Override
    public double getArea() {
        double area = this.width * this.length;
        return area;
    }

    @Override
    public double getPerimeter() {
        double scope = 2 * (this.width + this.length);
        return scope;
    }
}
