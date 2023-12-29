package satu;

//import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ujian extends JFrame {

    private JPanel basePanel = null;
    private JComboBox<String> jComboxR = null;
//    private JLabel labelKM = null;
    private JTextField fieldInput = null;
    private JButton buttonConvert = null;
//    private JLabel labelCM = null;
    private JComboBox<String> jComboxS = null;
    private JTextField textFieldOutput = null;
    private String[] label = new String[]{
        "KM", "HM", "DAM", "M", "DM", "CM", "MM"
    };

    public Ujian() {
        initGUI();
    }

    private void initGUI() {
        setContentPane(getBasePanel());
        setTitle("INFORMATIKA");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setVisible(true);
    }

    private JPanel getBasePanel() {
        if (basePanel == null) {
            basePanel = new JPanel();
//            basePanel.add(getlabelKM());
            basePanel.add(getcomboBoxR());
            basePanel.add(fieldInput());
            basePanel.add(getbuttonConvert());
//            basePanel.add(getlabelCM());
            basePanel.add(gettextFieldOutput());
            basePanel.add(getComboBoxS());
        }
        return basePanel;
    }

    private JComboBox<String> getComboBoxS() {
        if (jComboxS == null) {
            jComboxS = new JComboBox<>(label);
        }
        return jComboxS;
    }

    private JComboBox<String> getcomboBoxR() {
        if (jComboxR == null) {
            jComboxR = new JComboBox<>(label);
        }
        return jComboxR;
    }

//    private JLabel getlabelKM() {
//        if (labelKM == null) {
//            labelKM = new JLabel("KM");
//        }
//        return labelKM;
//
//    }
    private JTextField fieldInput() {
        if (fieldInput == null) {
            fieldInput = new JTextField();
            fieldInput.setPreferredSize(new Dimension(80, 20));
            
        }
        return fieldInput;

    }

    private JButton getbuttonConvert() {
        if (buttonConvert == null) {
            buttonConvert = new JButton("Convert--->");
            buttonConvert.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int indexIn = jComboxR.getSelectedIndex();
                    int indexOut = jComboxS.getSelectedIndex();

                    String sInput = fieldInput.getText();
                    double input = Double.parseDouble(sInput);
                    double output = convert(indexIn, indexOut, input);
                    textFieldOutput.setText(" " + String.format("%.06f", output));

//                    String KM = field2.getText();
//                    double km = Double.parseDouble(KM);
//                    double cm = km * 100_00;
//                    String sCM = String.valueOf(cm);
//                    textFieldCM.setText(sCM) ;
                }
            });
        }
        return buttonConvert;

    }

    private double convert(int dari, int ke, double value) {
        double km = value / Math.pow(10, dari);

        double result = km * Math.pow(10, ke);
        return result;
    }

//    private JLabel getlabelCM() {
//        if (labelCM == null) {
//            labelCM = new JLabel("CM");
//        }
//        return labelCM;
//    }
    private JTextField gettextFieldOutput() {
        if (textFieldOutput == null) {
            textFieldOutput = new JTextField("");
            textFieldOutput.setPreferredSize(new Dimension(80, 20));
        }
        return textFieldOutput;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ujian n = new Ujian();
            }
        });
    }

}
