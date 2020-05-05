package com.simple.testapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversionsEndpoint {
    private static double KELVIN_FREEZE_TEMP = 273.15;
    private static double MILE_TO_KM = 1.60934;

    @RequestMapping("/ktoc")
    public static double kelvinToCelcius(final double kelvin) {
        return kelvin - KELVIN_FREEZE_TEMP;
    }

    @RequestMapping("/ctok")
    public static double celciusToKelvin(final double celcius) {
        return celcius + KELVIN_FREEZE_TEMP;
    }

    @RequestMapping("/mtok")
    public static double milesToKilometers(final double miles) {
        return miles / MILE_TO_KM;
    }

    @RequestMapping("/ktom")
    public static double kilometersToMiles(final double kilometers) {
        return kilometers * MILE_TO_KM;
    }
}
