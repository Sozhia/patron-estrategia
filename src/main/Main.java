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

/*
 Ejemplo Básico de descarga de contenido desde una URL.
 Nótese cómo se manipula el contenido en memoria, sin realizar el paso por fichero.

 Los ejemplos de lanzamiento MainOpenData y MainCovid utilizan estos enlaces respectivamente:
 https://opendata-ajuntament.barcelona.cat/data/dataset/fcef8a36-64df-4231-9145-a4a3ef757f02/resource/cd0220bb-f75d-4737-ac27-339db8650ef6/download
 https://cnecovid.isciii.es/covid19/resources/datos_ccaas.csv
 */
public class Main {

    public static void main(String [] args) throws IOException {
        try {

            // Create an object of filereader
            // class with CSV file as a parameter.
            FileReader filereader = new FileReader("A:\\Workspace\\DAP\\patron-estrategia\\src\\data\\provres.csv");

            // create csvReader object passing
            // file reader as a parameter
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;

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
    }
}
