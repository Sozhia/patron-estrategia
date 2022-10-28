package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lienzo extends JDialog {
    private JPanel contentPane;

    public Lienzo() {
        setContentPane(contentPane);
        setModal(true);
        setPreferredSize(new Dimension(800, 600));
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

    }

    private void onCancel() {
        System.exit(0);
    }

}
