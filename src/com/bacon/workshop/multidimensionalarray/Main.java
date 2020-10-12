package com.bacon.workshop.multidimensionalarray;

public class Main extends MultiDimensionalArray {

    public static void main(String[] args) {
        MultiDimensionalArray multiDimensionalArray = new MultiDimensionalArray();
        String result = Integer.toString(multiDimensionalArray.displayMultiDimensionalArray()[1][2]);
        System.out.print(result);
    }
}