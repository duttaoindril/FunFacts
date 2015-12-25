package com.drillin.oindrildutta.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Oindril Dutta on 12/22/2015.
 */
public class ColorWheel {
    Random randgen = new Random();
    int current = 0;
    int color = 0;

    public int getColor() {
        do {
            color = Color.argb(255, randgen.nextInt(256), randgen.nextInt(256), randgen.nextInt(256));
        } while(current == color);
        current = color;
        return color;
    }
}
