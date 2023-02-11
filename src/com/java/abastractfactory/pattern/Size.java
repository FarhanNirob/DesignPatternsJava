package com.java.abastractfactory.pattern;

/**
 * This is Size Abstract Class
 */
public abstract class Size {
    protected String vehicleSize;

    public void getAskedSize(String vehicleSize){
        System.out.println("Asked Size is "+vehicleSize);
    }

}
