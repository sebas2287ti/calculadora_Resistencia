package com.restcal.infrastructure.ui.windows;

import com.restcal.infrastructure.ui.components.Background;
import com.restcal.infrastructure.ui.components.DataBaseColors;
import java.awt.*;
import javax.swing.*;

public class Resistor extends JFrame {
    private JPanel mainPanel;
    private JComboBox<DataBaseColors> color1;
    private JComboBox<DataBaseColors> color2;
    private JComboBox<DataBaseColors> multiple1;
    private JComboBox<DataBaseColors> tolerance1;

    public Resistor() {

        //245, 142 -- 277, 267 color1
        //298. 142 -- 330, 267 color2
        //351, 142 -- 384, 267 mult1
        //515, 142 -- 538. 267 tolerance

    }

    public JPanel getMainPanel() {
        Background background = new Background("/assets/images/Resistencia.png");
        background.setLayout(new BorderLayout());

        /*
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.out.println(" X: " + e.getX() + " , Y: " + e.getY());
            }
        });
        */

        if (mainPanel != null) {
        mainPanel.setOpaque(false);
        background.add(mainPanel, BorderLayout.CENTER);
        };
        return background;
    }

}

