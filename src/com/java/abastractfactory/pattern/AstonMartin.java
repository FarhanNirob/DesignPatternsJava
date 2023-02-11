package com.java.abastractfactory.pattern;

/**
 * This is concrete classes that implements vehicle interface
 */
public class AstonMartin implements Vehicle{
    private final String vehicleName;
    public AstonMartin(){
        vehicleName = "Aston Martin";
    }

    public String getVehicleName(){
        return vehicleName;
    }
}
