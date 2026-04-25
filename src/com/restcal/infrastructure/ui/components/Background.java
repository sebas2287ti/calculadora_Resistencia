package com.restcal.infrastructure.ui.components;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Background extends JPanel {
    private Image img;

    public Background(String S) {
        this.img = new ImageIcon(Objects.requireNonNull(getClass().getResource("/assets/images/Resistencia.png"))).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (img != null) {
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }

}
