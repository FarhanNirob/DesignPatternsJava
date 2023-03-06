package com.java.singleton.pattern;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SingletonLazyInstantiation {
    /**
     * Lazy Instantiation: creation of instance when required
     */
    static SingletonLazyInstantiation instance;// object is not created early. only declared.
    private SingletonLazyInstantiation(){};//as it is private, Constructor will be created once
    public static SingletonLazyInstantiation getInstance()// it will return the object
    {
        if(instance==null)// at first object the instance will be null so object will be created but for another time it is not null, so it will not be created and it will return the first created instance.
        {
        instance = new SingletonLazyInstantiation();// The object will be created when the instance is called
        }
        return instance;
    }
    public void getTime()
    {
        System.out.println("Singleton Accessed with one instance");
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        String time = currentTime.format(formatter);
        System.out.println("Current time is: "+time);
    }
}
