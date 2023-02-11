package com.java.abastractfactory.pattern;

/**
 * This is concrete classes that implements vehicle interface
 */
public class Mercedes implements Vehicle{
    private final String vehicleName;
    public Mercedes(){
        vehicleName = "Mercedes";
    }

    public String getVehicleName(){
        return vehicleName;
    }
}
