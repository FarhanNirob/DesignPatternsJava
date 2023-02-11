package com.java.abastractfactory.pattern;

/**
 * This class inherit AbstractFactory to generate the object og concrete class.
 */
public class VehicleFactory extends AbstractFactory{
    public Vehicle getVehicle(String vehicle){
        if (vehicle == null){
            return null;
        }
        if (vehicle.equalsIgnoreCase("BMW")){
            return new BMW();
        }
        if (vehicle.equalsIgnoreCase("Mercedes")){
            return new Mercedes();
        }
        if (vehicle.equalsIgnoreCase("Aston Martin")){
            return new AstonMartin();
        }
        return null;
    }

    public Size getSize(String size){
        return null;
    }
}
