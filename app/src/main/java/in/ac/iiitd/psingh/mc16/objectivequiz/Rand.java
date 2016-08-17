package in.ac.iiitd.psingh.mc16.objectivequiz;

import java.util.Random;

/**
 * Created by SONY on 8/17/2016.
 */
public class Rand {

    public static int rRand(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max<min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }



}
