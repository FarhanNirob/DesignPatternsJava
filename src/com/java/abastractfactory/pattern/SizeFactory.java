package com.java.abastractfactory.pattern;

/**
 * This class inherit AbstractFactory to generate the object og concrete class.
 */
public class SizeFactory extends AbstractFactory{
    @Override
    public Vehicle getVehicle(String vehicle) {
        return null;
    }

    public Size getSize(String size){
        if (size == null){
            return null;
        }
        if (size.equalsIgnoreCase("Large")){
            return new LargeVehicle();
        }
        if (size.equalsIgnoreCase("Medium")){
            return new MediumVehicle();
        }
        if (size.equalsIgnoreCase("Small")){
            return new SmallVehicle();
        }
        return null;
    }

}
