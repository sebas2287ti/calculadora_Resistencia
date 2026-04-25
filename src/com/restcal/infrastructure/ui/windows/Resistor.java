package com.restcal.infrastructure.ui.windows;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Resistor extends JFrame {
    private JPanel mainPanel;

    public Resistor() {
    }

    public JPanel getMainPanel() {
        Background background = new Background("/assets/images/Resistencia.png");
        background.setLayout(new BorderLayout());

        if (mainPanel != null) {
        mainPanel.setOpaque(false);
        background.add(mainPanel, BorderLayout.CENTER);
        };
        return background;
    }
}
