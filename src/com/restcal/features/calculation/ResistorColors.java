package com.restcal.features.calculation;

import com.restcal.infrastructure.ui.components.DataBaseColors;
import com.restcal.infrastructure.ui.windows.Resistor;

import javax.swing.*;

public class ResistorColors {

    public float[] ColorTranslate (JComboBox<DataBaseColors> Digit1, JComboBox <DataBaseColors> Digit2, JComboBox <DataBaseColors> Multiple1, JComboBox <DataBaseColors> Tolerance1 ) {
        DataBaseColors digit1 = (DataBaseColors) Digit1.getSelectedItem();
        DataBaseColors digit2 = (DataBaseColors) Digit2.getSelectedItem();
        DataBaseColors multiple1 = (DataBaseColors) Multiple1.getSelectedItem();
        DataBaseColors tolerance1 = (DataBaseColors) Tolerance1.getSelectedItem();
        return new float[] {digit1.getDigit1(), digit2.getDigit1(), multiple1.getMultiple1(), tolerance1.getTolerance1()};
    }
}
