package com.restcal;

import javax.swing.*;
import com.restcal.infrastructure.ui.windows.Resistor;
import com.restcal.infrastructure.ui.windows.*;

public class ResistorCalculator {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

        Resistor ui = new Resistor();
        JFrame frame = new JFrame("Calculadora Resistencia");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(ui.getMainPanel());
        //frame.setSize(800, 700);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        });
    }
}
