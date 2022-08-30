package personas.presentacion;

import javax.swing.*;

public class View {
    private JPanel panel;
    private JLabel idLbl;
    private JTextField idFLbl;
    private JLabel nombreLbl;
    private JLabel sexoLbl;
    private JTextField Nombre;
    private JRadioButton masculinoRadioButton;
    private JRadioButton femeninoRadioButton;
    private JLabel estadoLbl;
    private JComboBox estadoComboBox1;
    private JLabel pasatiemposLbl;
    private JCheckBox musicaCheckBox;
    private JCheckBox cineCheckBox;
    private JCheckBox otrosCheckBox;
    private JButton guardarButton;
    private JButton cancelarButton;
//generar panel para el main
    public JPanel getPanel() {
        return panel;
    }
}

//new swing UI, Form