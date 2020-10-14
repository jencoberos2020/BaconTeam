package com.bacon.workshop.temperature;

public class Main extends TemperatureCalc {

    public static void main(String[] args) {
        int celsius = 1;
        TemperatureCalc temperatureCalc = new TemperatureCalc();
        Double fahrenheit = temperatureCalc.getFahrenheit(celsius);
        System.out.println("Fahrenheit conversion is: " + fahrenheit + "F");
        Double kelvin = temperatureCalc.getKelvin(celsius);
        System.out.println("Kelvin conversion is: " + kelvin + "K");
    }
}