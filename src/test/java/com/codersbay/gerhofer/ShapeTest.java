package com.codersbay.gerhofer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @Test
    public void testGetArea() {
        Square square = new Square(Colors.RED, true, 3.5);
        Rectangle rectangle = new Rectangle(Colors.RED, true, 2.5, 4.5);
        Circle circle = new Circle(Colors.RED, true, 2.0);
        assertEquals(12.25, square.getArea());
        assertEquals(11.25, rectangle.getArea());
        assertEquals(12.57, circle.getArea());
    }

    @Test
    public void testGetPerimeter() {
        Square square = new Square(Colors.RED, true, 3.5);
        Rectangle rectangle = new Rectangle(Colors.RED, true, 2.5, 4.5);
        Circle circle = new Circle(Colors.RED, true, 4.5);
        assertEquals(14.0, square.getPerimeter());
        assertEquals(14.0, rectangle.getPerimeter());
        assertEquals(28.27, circle.getPerimeter());
    }

    @Test
    public void testIfRadiusIsNeverZeroOrNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Square square = new Square(Colors.RED, true, -2.5);
            Rectangle rectangle = new Rectangle(Colors.RED, true, 2.5, -1.0);
            Circle circle = new Circle(Colors.RED, true, 0);
        });
    }
}
