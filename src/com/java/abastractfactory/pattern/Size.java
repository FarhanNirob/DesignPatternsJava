package com.java.abastractfactory.pattern;

/**
 * This is Size Abstract Class
 */
public abstract class Size {
    protected String vehicleSize;
//    abstract void getSize(String vehicleSize);
    public void getAskedSize(String vehicleSize){

        System.out.println("Your Car Size is: "+vehicleSize);
    }
}
