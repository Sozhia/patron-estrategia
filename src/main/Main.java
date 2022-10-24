package main;

import com.opencsv.CSVReader;
import main.HTTPFileDownloader;
import org.junit.jupiter.params.shadow.com.univocity.parsers.csv.CsvParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String [] args) throws IOException {
        /*
        try {

            // Create an object of filereader
            // class with CSV file as a parameter.
            FileReader filereader = new FileReader("A:\\Workspace\\DAP\\patron-estrategia\\src\\data\\provres.csv");

            // create csvReader object passing
            // file reader as a parameter
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;
            nextRecord = csvReader.readNext();

            /*
            // we are going to read data line by line
            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    */
        App dialog = new App();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
