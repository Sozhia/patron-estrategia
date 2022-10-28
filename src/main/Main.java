package main;

import com.opencsv.exceptions.CsvValidationException;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String [] args) throws IOException, CsvValidationException {
        System.gc();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                App dialog = new App();
                dialog.pack();
                dialog.setVisible(true);
            }
        });
    }
}
