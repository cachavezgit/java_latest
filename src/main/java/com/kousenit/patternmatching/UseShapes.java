package com.kousenit.patternmatching;

public class UseShapes {
    public static double getArea(Object shape) {
        if (shape instanceof Square s) {
            return s.getSide() * s.getSide();
        } else if (shape instanceof Circle c) {
            return c.getRadius() * c.getRadius() * Math.PI;
        }
        throw new IllegalArgumentException("Only circles and squares work");
    }

    public static void main(String[] args) {
        System.out.println(getArea(new Circle(1.0)));
        System.out.println(getArea(new Square(1.0)));
    }
}
