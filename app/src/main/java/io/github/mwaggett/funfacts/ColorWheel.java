package io.github.mwaggett.funfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {

    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7", // light gray
            "#8b4513", // bronze
            "#ddca8b"  // gold
    };

    public int getColor() {
        String color = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        return Color.parseColor(color);
    }
}
