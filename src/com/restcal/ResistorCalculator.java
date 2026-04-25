package com.restcal;

import javax.swing.*;
import com.restcal.infrastructure.ui.windows.Resistor;
import com.restcal.infrastructure.ui.windows.*;

import java.awt.*;

public class ResistorCalculator {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

        Resistor ui = new Resistor();
        JFrame frame = new JFrame("Calculadora Resistencia");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(ui.getMainPanel());
        frame.setPreferredSize(new Dimension(800, 475));
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        });
    }
}
