package com.codersbay.gerhofer;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(Color.RED, true, 2.0);
        circle.getArea();
        circle.getPerimeter();

        Rectangle rectangle = new Rectangle(Color.BLUE, false, 2.5, 1.5);
        rectangle.getArea();
        rectangle.getPerimeter();

        Square square = new Square(Color.WHITE, true, 3.5, 3.5);
        square.getArea();
        square.getPerimeter();

        Shape shape = new Rectangle(Color.ORANGE, true, 2.5, 2.5);
        shape.getArea();
        shape.getPerimeter();

    }

}
