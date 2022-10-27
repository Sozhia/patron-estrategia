package main;

import com.opencsv.exceptions.CsvException;

import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

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
                try {
                    onOK();
                } catch (IOException | CsvException ex) {
                    throw new RuntimeException(ex);
                }
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

    private void onOK() throws IOException, CsvException {
        ILoadDataStrategy strategy =
                LoadDataFactory.createLoadDataStrategy(LoadDataStrategyType.LOCAL);
        IPrintStrategy printer;
        ContextLoadData context = new ContextLoadData(strategy);
        String url;

        if(fileOneRadioButton.isSelected()){
            url = "A:\\Workspace\\DAP\\patron-estrategia\\src\\data\\provres.csv";
        } else if (fileTwoRadioButton.isSelected()){
            url = "A:\\Workspace\\DAP\\patron-estrategia\\src\\data\\provres_60_mas.csv";
        } else {
            url = "A:\\Workspace\\DAP\\patron-estrategia\\src\\data\\provres_todas_edades.csv";
        }

        DataSet dataset = new DataSet(url, context);
        dataset.printData();

        if (barsRadioButton.isSelected()) {
            printer = PrintFactory.createPrintStrategy(PrintStrategyType.BAR);
        } else {
            printer = PrintFactory.createPrintStrategy(PrintStrategyType.POINT_CLOUD);
        }

        printer.printDiagram(dataset);
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        System.exit(0);
        dispose();
    }
}
