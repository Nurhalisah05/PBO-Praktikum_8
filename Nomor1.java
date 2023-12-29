package satu;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Nomor1 extends JFrame {

    private JPanel basePanel = null;
    private JLabel label1;
    private JLabel label1Informatika = null;
    private JTextField fieldInformatika = null;
    private JLabel labelUnsulbar = null;
    private JTextField fieldUnsulbar = null;
    private JButton buttonOK = null;
    private JButton buttonClose = null;

    public Nomor1() {
        initUI();
    }

    private void initUI() {
        setContentPane(getBasePanel());
        setTitle("INFORMATIKA");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    private JPanel getBasePanel() {
        if (basePanel == null) {
            basePanel = new JPanel();
            basePanel.add(getJLabelInformatika());
            basePanel.add(getfieldInformatika());
            basePanel.add(getlabelUnsulbar());
            basePanel.add(getfieldUnsulbar());
            basePanel.add(getbuttonOK());
            basePanel.add(getbuttonClose());
        }
        return basePanel;
    }

    private JLabel getJLabelInformatika() {
        if (label1Informatika == null) {
            label1Informatika= new JLabel("INFORMATIKA");

        }
        return label1Informatika;
    }

    private JTextField getfieldInformatika() {
        if (fieldInformatika == null) {
            fieldInformatika = new JTextField();
            fieldInformatika.setPreferredSize(new Dimension(80, 20));

        }
        return fieldInformatika;

    }

    private JLabel getlabelUnsulbar() {
        if (labelUnsulbar == null) {
            labelUnsulbar = new JLabel("UNSULBAR");
        }
        return labelUnsulbar;

    }

    private JTextField getfieldUnsulbar() {
        if (fieldUnsulbar == null) {
            fieldUnsulbar = new JTextField("INFORMATIKA");
        }
        return fieldUnsulbar;

    }

    private JButton getbuttonOK() {
        if (buttonOK == null) {
            buttonOK = new JButton("OK");
        }
        return buttonOK;

    }

    private JButton getbuttonClose() {
        if (buttonClose == null) {
            buttonClose = new JButton("CLOSE");
            buttonClose.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
              }
            });
        }
        return buttonClose;

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Nomor1 n = new Nomor1();
            }
        });
    }

}
