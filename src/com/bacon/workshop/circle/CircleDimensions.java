package com.bacon.workshop.circle;

public class CircleDimensions {
    final double PI = 3.141592;
    public double getCircumference(int radius) {
        double circumference = (2 * PI) * radius;
        return circumference;
    }

    public double getArea(int radius) {
        double area = (2 * PI) * (radius ^ 2);
        return area;
    }
}
