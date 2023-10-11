package org.example;

import org.example.*;

import java.util.Random;

public class AlienFactory {
    private enum Aliens {SQUID, MONKEY, TIGER, RAT};
    private static Random r = new Random();
    public Alien getAlien(){
        Aliens a = Aliens.values()[r.nextInt(Aliens.values().length)];
        switch(a){
            case SQUID:
                return new SquidAlien();
            case RAT:
                return new RatAlien();
            case TIGER:
                return new TigerAlien();
            case MONKEY:
                return new MonkeyAlien();
            default:
                System.out.println("No corresponding alien");
                return null;

        }
    }
}
