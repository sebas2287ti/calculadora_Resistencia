package com.restcal.infrastructure.ui.windows;

import com.restcal.infrastructure.ui.components.Background;
import com.restcal.infrastructure.ui.components.DataBaseColors;
import com.restcal.infrastructure.ui.components.UiConstrutor;

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
        /*
        X: 246 , Y: 286
        X: 554 , Y: 324
         */

    }

    public JPanel getMainPanel() {
        Background background = new Background("/assets/images/Resistencia.png");
        background.setLayout(null);


        background.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.out.println(" X: " + e.getX() + " , Y: " + e.getY());
            }
        });


        JComboBox<DataBaseColors> ComboBoxDigit1 = UiConstrutor.CrearComboBox(245,277,142,267, DataBaseColors.getSoloDigitos());
        JComboBox<DataBaseColors> ComboBoxDigit2 = UiConstrutor.CrearComboBox(298,330,142,267, DataBaseColors.getSoloDigitos());
        JComboBox<DataBaseColors> ComboBoxMultiple1 = UiConstrutor.CrearComboBox(351,384,142,267, DataBaseColors.getSoloMultiplicadores());
        JComboBox<DataBaseColors> ComboBoxTolerance1 = UiConstrutor.CrearComboBox(502,538,142,267, DataBaseColors.getSoloTolerancias());
        JButton BotonCalcular = UiConstrutor.CrearBoton(246,554,286,324, "Calcular");
        JLabel OhmiosMax = UiConstrutor.CrearLabel(653,750,153,188, "0Ω");
        JLabel Ohmiosmin = UiConstrutor.CrearLabel(653,750,219,254, "0Ω");

        background.add(ComboBoxDigit1);
        background.add(ComboBoxDigit2);
        background.add(ComboBoxMultiple1);
        background.add(ComboBoxTolerance1);
        background.add(BotonCalcular);
        background.add(OhmiosMax);
        background.add(Ohmiosmin);

        if (mainPanel != null) {
        mainPanel.setOpaque(false);
        background.add(mainPanel, BorderLayout.CENTER);
        };
        return background;
    }

}

