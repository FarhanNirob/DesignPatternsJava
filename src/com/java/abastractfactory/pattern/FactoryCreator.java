package com.java.abastractfactory.pattern;

/**
 * This class for getting the factories by passing information such as vehicle or size.
 */
public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("Vehicle")){
            return new VehicleFactory();
        }
        else if (choice.equalsIgnoreCase("Size")){
            return new SizeFactory();
        }
        return null;
    }
}
