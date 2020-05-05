package com.simple.testapp;

public class ConversionsEndpoint {
    private static double KELVIN_FREEZE_TEMP = 273.15;
    private static double MILE_TO_KM = 1.60934;

    public static double kelvinToCelcius(final double kelvin) {
        return kelvin - KELVIN_FREEZE_TEMP;
    }

    public static double celciusToKelvin(final double celcius) {
        return celcius + KELVIN_FREEZE_TEMP;
    }

    public static String milesToKilometers(final double kilometers) {
        return
    }

    public static String kilometersToMiles(final double miles) {

    }
}
