package personas.presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public View() {  //listener para guardar
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(Nombre.getText()); //nombreFld
                if(masculinoRadioButton.isSelected()) System.out.println('M');
                System.out.println(estadoComboBox1.getSelectedItem());
            }
        });
    }

    //generar panel para el main
    public JPanel getPanel() {
        return panel;
    }
}
