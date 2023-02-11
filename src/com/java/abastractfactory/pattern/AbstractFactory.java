package com.java.abastractfactory.pattern;

/**
 * Abstract Class to get the factories for Vehicle and Size Objects.
 */
public abstract class AbstractFactory {
    public abstract Vehicle getVehicle(String vehicle);
    public abstract Size getSize(String size);
}
