package com.restcal.infrastructure.ui.components;

import java.awt.*;
import java.awt.Color;
import java.security.PublicKey;


public enum DataBaseColors {

    BLACK(Color.BLACK, 0F, 1F, 0F),
    COFFE(new Color(0xFF8D4208, true), 1F,2F, 0F),
    RED(Color.RED, 2F,3F,0.02F),
    ORANGE(Color.ORANGE,3F, 4F,0F),
    YELLOW(Color.YELLOW,4F,4F,0F),
    GREEN(Color.GREEN, 5F,5F,0F),
    BLUE(Color.CYAN, 6F,6F, 0F),
    VIOLET(new Color(143, 0, 255),7F,7F,0F),
    GREY(Color.GRAY,8F,8F,0F),
    WHITE(Color.WHITE,9F,9F,0F),
    GOLDEN(new Color(211, 175, 55),null,null,0.05F),
    SILVER(new Color(192, 192, 192), null,null,0.1F)

    ;

    private Color color;
    private Float digit1;
    private Float multiple1;
    private Float tolerance1;



    DataBaseColors (Color color, Float digit1, Float multiple1, Float tolerance1 ) {
        this.color = color;
        this.digit1 = digit1;
        this.multiple1 = multiple1;
        this.tolerance1 = tolerance1;
    }

    public static DataBaseColors[] getSoloDigitos() {
        return java.util.Arrays.stream(values())
                .filter(c -> c.digit1 != null)
                .toArray(DataBaseColors[]::new);
    }

    public static DataBaseColors[] getSoloMultiplicadores() {
        return java.util.Arrays.stream(values())
                .filter(c -> c.multiple1 != null)
                .toArray(DataBaseColors[]::new);
    }

    public static DataBaseColors[] getSoloTolerancias() {
        return java.util.Arrays.stream(values())
                .filter(c -> c.tolerance1 != null)
                .toArray(DataBaseColors[]::new);
    }

    public Color getColor() {
        return color;
    }

    public float getDigit1() {
        return digit1;
    }

    public float getMultiple1() {
        return multiple1;
    }

    public float getTolerance1() {
        return tolerance1;
    }
}
