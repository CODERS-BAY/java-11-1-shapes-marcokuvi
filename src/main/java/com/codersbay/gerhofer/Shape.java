package com.codersbay.gerhofer;

public abstract class Shape {

    private Colors color;
    private boolean isFilled;

    public Shape(Colors color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();


}
