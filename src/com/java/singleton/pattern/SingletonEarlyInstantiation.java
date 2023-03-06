package com.java.singleton.pattern;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SingletonEarlyInstantiation {
    /**
     * Early Instantiation: creation of instance at load time
     */
    private static SingletonEarlyInstantiation instance = new SingletonEarlyInstantiation();// static instance create at early
    private SingletonEarlyInstantiation(){};//as it is private, Constructor will be created once
    public static SingletonEarlyInstantiation getInstance()// it will return the object
    {
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
