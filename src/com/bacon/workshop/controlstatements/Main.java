package com.bacon.workshop.controlstatements;

public class Main extends EvenNames {
    public static void main(String[] args) {
        String listOfNames[] = { "Oscar", "Wilfred", "Adam", "Bethany", "Sam" };
        EvenNames evenNames = new EvenNames();
        evenNames.namePrinter(listOfNames);
    }
}
