package com.codersbay.gerhofer;

public class Circle extends Shape {

    private double radius;

    public Circle(Colors color, boolean isFilled, double radius) {
        super(color, isFilled);
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius cannot be 0 or negative");
        } else {
            this.radius = radius;
        }
    }

    @Override
    public double getArea() {
        double area = (radius * radius) * Math.PI;
        double roundedUpArea = Math.round(area * 100) / 100.0;
        return roundedUpArea;
    }

    @Override
    public double getPerimeter() {
        double scope = 2.0 * radius * Math.PI;
        double roundedUpScope = Math.round(scope * 100) / 100.0;
        return roundedUpScope;
    }
}
