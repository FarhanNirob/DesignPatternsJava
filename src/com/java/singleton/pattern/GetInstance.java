package com.java.singleton.pattern;

public class GetInstance {
    public static void main(String[] args){
        SingletonEarlyInstantiation objEarly = SingletonEarlyInstantiation.getInstance();
        objEarly.getTime();

        SingletonLazyInstantiation objLazy = SingletonLazyInstantiation.getInstance();
        SingletonLazyInstantiation objLazy1 = SingletonLazyInstantiation.getInstance();

        //Checking if condition is working and is not creating object for evey call.
        if(objLazy==objLazy1){
            System.out.println("Same Object is returned every time");
        }else {
            System.out.println("Objects are not same");
        }
        objLazy.getTime();
    }
}
