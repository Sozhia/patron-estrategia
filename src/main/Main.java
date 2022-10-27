package main;

import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;

public class Main {

    public static void main(String [] args) throws IOException, CsvValidationException {

        App dialog = new App();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);

    }
}
