package com.simple.testapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversionsEndpoint  {
    private static double KELVIN_FREEZE_TEMP = 273.15;
    private static double MILE_TO_KM = 1.60934;

    @RequestMapping("/ktoc")
    public double kelvinToCelcius(final double kelvin) {
        return kelvin - KELVIN_FREEZE_TEMP;
    }

    @RequestMapping("/ctok")
    public double celciusToKelvin(final double celcius) {
        return celcius + KELVIN_FREEZE_TEMP;
    }

    @RequestMapping("/mtok")
    public double milesToKilometers(final double miles) {
        return miles / MILE_TO_KM;
    }

    @RequestMapping("/ktom")
    public double kilometersToMiles(final double kilometers) {
        return kilometers * MILE_TO_KM;
    }
}
