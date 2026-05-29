package com.restcal.infrastructure.ui.windows;

import com.restcal.infrastructure.ui.components.Background;
import com.restcal.infrastructure.ui.components.DataBaseColors;
import com.restcal.infrastructure.ui.components.UiConstrutor;
import com.restcal.features.calculation.ResistorColors;
import com.restcal.domain.entities.LogicResistor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
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
        Events();
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

    private void Events () {
        BotonCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResistorColors date = new ResistorColors();
                LogicResistor logica = new LogicResistor();

                float[] ArrayData = date.ColorTranslate(color1, color2, multiple1, tolerance1);

                float max = logica.ResistorOhmiosMax(ArrayData[0], ArrayData[1], ArrayData[2], ArrayData[3]);
                float min = logica.ResistorOhmiosmin(ArrayData[0], ArrayData[1], ArrayData[2], ArrayData[3]);

                OhmiosMax.setText(
                        max >= 1_000_000 ? String.format("%.2f MΩ", max / 1_000_000f) :
                                max >= 1_000     ? String.format("%.2f kΩ", max / 1_000f) :
                                        String.format("%.2f Ω", max)
                );

                OhmiosMin.setText(
                        min >= 1_000_000 ? String.format("%.2f MΩ", min / 1_000_000f) :
                                min >= 1_000     ? String.format("%.2f kΩ", min / 1_000f) :
                                        String.format("%.2f Ω", min)
                );
            }
        });
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

