package main;

import javax.swing.*;
import java.awt.event.*;

public class App extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JLabel authorLabel;
    private JPanel contentPanel;
    private JPanel buttonsPanel;

    private JRadioButton fileOneRadioButton;
    private JRadioButton fileTwoRadioButton;
    private JRadioButton fileThreeRadioButton;
    private JLabel fileLabel;
    private JLabel diagramLabel;
    private JRadioButton cloudRadioButton;
    private JRadioButton barsRadioButton;

    public App() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        ButtonGroup filesGroup = new ButtonGroup();

        filesGroup.add(fileOneRadioButton);
        filesGroup.add(fileTwoRadioButton);
        filesGroup.add(fileThreeRadioButton);

        ButtonGroup diagramsGroup = new ButtonGroup();

        diagramsGroup.add(barsRadioButton);
        diagramsGroup.add(cloudRadioButton);

    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }
}
