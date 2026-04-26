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
    private JButton BotonCalcular;
    private JLabel OhmiosMax;
    private JLabel OhmiosMin;

    public Resistor() {
        inicializador();
    }

        private void inicializador () {
            color1 = UiConstrutor.CrearComboBox(245,277,142,267, DataBaseColors.getSoloDigitos());
            color2 = UiConstrutor.CrearComboBox(298,330,142,267, DataBaseColors.getSoloDigitos());
            multiple1 = UiConstrutor.CrearComboBox(351,384,142,267, DataBaseColors.getSoloMultiplicadores());
            tolerance1 = UiConstrutor.CrearComboBox(502,538,142,267, DataBaseColors.getSoloTolerancias());
            BotonCalcular = UiConstrutor.CrearBoton(246,554,286,324, "Calcular");
            OhmiosMax = UiConstrutor.CrearLabel(653,750,153,188, "0Ω");
            OhmiosMin = UiConstrutor.CrearLabel(653,750,219,254, "0Ω");
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

        background.add(color1);
        background.add(color2);
        background.add(multiple1);
        background.add(tolerance1);
        background.add(BotonCalcular);
        background.add(OhmiosMax);
        background.add(OhmiosMin);

        if (mainPanel != null) {
        mainPanel.setOpaque(false);
        background.add(mainPanel, BorderLayout.CENTER);
        };
        return background;
    }

}

