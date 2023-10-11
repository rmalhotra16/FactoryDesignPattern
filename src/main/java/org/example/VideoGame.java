package org.example;

import java.util.Random;


public class VideoGame {

    private static final int ALIENGANG = 10;
    public void play(){
        //create an array of 10 aliens and print them
        AlienFactory a = new AlienFactory();
        Alien [] array = new Alien[ALIENGANG];
        for(int i = 0; i<array.length; i++){
            array[i] = a.getAlien();
            System.out.println(array[i]);
        }

    }


}
