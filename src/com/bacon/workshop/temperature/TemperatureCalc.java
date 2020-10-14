package com.bacon.workshop.temperature;

public class TemperatureCalc {
    public double getFahrenheit(int celsius) {
        double fahrenheit = ((9 / 5) * celsius) + 32;
        return fahrenheit;
    }
    public double getKelvin(int celsius) {
        double kelvin = celsius + 273;
        return kelvin;
    }
}
