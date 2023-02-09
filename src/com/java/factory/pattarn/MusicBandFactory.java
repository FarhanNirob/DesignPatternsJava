package com.java.factory.pattarn;

/**
 * Fetch Objects from the interface
 * Creates instance of subclasses
 */

public class MusicBandFactory {
    public static MusicBand getInstance(int rating){
        MusicBand musicBand = null;

        switch (rating){
            case 1:
                musicBand = new PinkFloyd();
                break;
            case 2:
                musicBand = new Beatles();
                break;
            case  3:
                musicBand = new LedZeppelin();
                break;
            default:
                System.out.println("Chose Between 3.");
                break;
        }
    return musicBand;
    }
}
