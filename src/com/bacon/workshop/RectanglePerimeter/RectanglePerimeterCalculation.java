package com.bacon.workshop.RectanglePerimeter;

public class RectanglePerimeterCalculation {

    public void RectanglePerimeter(int rectangleWidth, int rectangleHeight) {
        int limit = 100;
        int width = rectangleWidth;
        int height = rectangleHeight;

        int rectanglePerimeter = (width + height) * 2;

        if (rectanglePerimeter < limit) {
            System.out.println("The perimeter of height " + height + " and width " + width + " is greater than " + limit);
        }
    }

}
