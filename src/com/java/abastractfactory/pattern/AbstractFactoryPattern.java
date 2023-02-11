package com.java.abastractfactory.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * In ths class, Use the FactoryCreator to get AbstractFactory in order to get factories of concrete classes by passing an information such as type.
 */
public class AbstractFactoryPattern {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Vehicle Name: ");
        String vehicleName = br.readLine();

        System.out.println("\n"+"Enter the Size of Vehicle: ");

        String size = br.readLine();

        AbstractFactory sizeFactory = FactoryCreator.getFactory("Size");
        Size size1 = sizeFactory.getSize(size);

        AbstractFactory vehicleFactory = FactoryCreator.getFactory("Vehicle");
        Vehicle  vehicle = vehicleFactory.getVehicle(vehicleName);

        System.out.println("The Vehicle is : "+vehicle.toString()+" "+ "The Size is :"+ size1.toString());
    }
}
