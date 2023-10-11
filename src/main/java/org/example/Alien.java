package org.example;

import java.util.Random;

public class Alien {
    private final String NAME;
    private static Random r = new Random();

    public Alien(String type){
        this.NAME = type + " " +r.nextInt(100);
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return this.NAME;
    }
}
