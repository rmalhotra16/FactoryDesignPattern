package org.example;

import java.util.Random;

public class BetterAlienFactory {

    private enum Aliens {SQUID, MONKEY, TIGER, RAT};
    private static Random r = new Random();
    public Alien getAlien(){
        Aliens a = Aliens.values()[r.nextInt(Aliens.values().length)];
        Alien alien = null;
        try{
            alien = (Alien)(Class.forName(a.toString()).getDeclaredConstructor().newInstance());
        } catch (Exception e){
            System.out.println("Unknown alien type");
        }
        return alien;
    }
}
