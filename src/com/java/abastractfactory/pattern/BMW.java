package com.java.abastractfactory.pattern;

/**
 * This is concrete classes that implements vehicle interface
 */
public class BMW implements Vehicle{
    private final String vehicleName;
    public BMW(){
        vehicleName = "BMW";
    }

    public String getVehicleName(){
        return vehicleName;
    }
}
