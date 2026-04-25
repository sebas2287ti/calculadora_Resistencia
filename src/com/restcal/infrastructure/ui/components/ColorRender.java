package com.restcal.infrastructure.ui.components;

import javax.swing.*;
import java.awt.*;

public class ColorRender extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

        if (value instanceof DataBaseColors) {
            DataBaseColors colorEnum = (DataBaseColors) value;

            setText("");
            setBackground(colorEnum.getColor());
            setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
            setPreferredSize(new Dimension(20, 25));
            setBackground(colorEnum.getColor());
            setOpaque(true);

        }

        if (isSelected) {
            setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        }

        return this;
    }
}
