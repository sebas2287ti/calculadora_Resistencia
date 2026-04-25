package com.restcal.infrastructure.ui.components;

import java.awt.*;
import java.awt.Color;


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
    GOLDEN(new Color(211, 175, 55),0F,0F,0.05F),
    SILVER(new Color(192, 192, 192), 0F,0F,0.1F)

    ;

    private Color color;
    private float digit1;
    private float digit2;
    private float multiple1;
    private float tolerance1;



    DataBaseColors (Color color, float digit1, float multiple1, float tolerance1 ) {
        this.color = color;
        this.digit1 = digit1;
        this.multiple1 = multiple1;
        this.tolerance1 = tolerance1;
    }
}
