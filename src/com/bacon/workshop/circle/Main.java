package com.bacon.workshop.circle;

public class Main extends CircleDimensions {

    public static void main(String[] args) {
        int radius = 1;
        CircleDimensions circleDimensions = new CircleDimensions();
        Double circumference = circleDimensions.getCircumference(radius);
        System.out.println("Circumference is: " + circumference);
        Double area = circleDimensions.getArea(radius);
        System.out.println("Area is: " + area);
    }
}