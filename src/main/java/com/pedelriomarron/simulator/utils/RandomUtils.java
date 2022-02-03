package com.pedelriomarron.simulator.utils;

import java.util.Random;

public class RandomUtils {


    static public int getRandomNumberUsingInts(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }
}
