package com.bacon.workshop.RectanglePerimeter;

public class RectanglePerimeterCalculation {

    public void RectanglePerimeter(int rectangleHeight, int rectangleWidth) {
        int limit = 100;
        int height = rectangleHeight;
        int width = rectangleWidth;

        int rectanglePerimeter = (width + height) * 2;

        if (rectanglePerimeter > limit) {
            System.out.println("The perimeter for height " + height + " and width " + width + " is greater than " + limit);
        }
    }

}
