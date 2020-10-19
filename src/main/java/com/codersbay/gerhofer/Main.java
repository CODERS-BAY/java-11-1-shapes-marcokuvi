package com.codersbay.gerhofer;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(Colors.RED, true, 2.0);
        circle.getArea();
        circle.getPerimeter();

        Rectangle rectangle = new Rectangle(Colors.BLUE, false, 2.5, 1.5);
        rectangle.getArea();
        rectangle.getPerimeter();

        Square square = new Square(Colors.WHITE, true, 3.5);
        square.getArea();
        square.getPerimeter();

        Shape shape = new Rectangle(Colors.ORANGE, true, 2.5, 2.5);
        shape.getArea();
        shape.getPerimeter();

    }

}
