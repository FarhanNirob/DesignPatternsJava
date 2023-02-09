package com.java.factory.pattarn;

/**
 * Client Uses Factory to get Object of Interface(MusicBand)
 */
public class User {
    public static void main(String[] args) {
        //PinkFloyd
        MusicBand pinkFloyd = MusicBandFactory.getInstance(1);
        System.out.println(pinkFloyd.getBandType());

        //Beatles
        MusicBand beatles = MusicBandFactory.getInstance(2);
        System.out.println(beatles.getBandType());

        //LedZeppelin
        MusicBand ledZeppelin = MusicBandFactory.getInstance(3);
        System.out.println(ledZeppelin.getBandType());
    }
}
