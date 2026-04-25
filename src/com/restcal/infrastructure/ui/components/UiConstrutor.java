    package com.restcal.infrastructure.ui.components;

    import javax.swing.JComboBox;

    public class UiConstrutor {

        public static JComboBox<DataBaseColors> CrearComboBox(int x1, int x2, int y1, int y2, DataBaseColors[] colores) {
            JComboBox<DataBaseColors> comboBox = new JComboBox<>(colores);

            comboBox.setRenderer(new ColorRender());
            comboBox.setBorder(null);
            comboBox.setFocusable(false);
            comboBox.setOpaque(true);

            int h = (x2-x1);
            int w = (y2-y1);
            comboBox.setBounds(x1,y1, h, w);
            comboBox.setBackground(colores[0].getColor());

            comboBox.addActionListener(e -> {
                DataBaseColors seleccionado = (DataBaseColors) comboBox.getSelectedItem();
                if (seleccionado != null) {
                    comboBox.setBackground(seleccionado.getColor());
                }
            });

            return comboBox;
        }
    }
