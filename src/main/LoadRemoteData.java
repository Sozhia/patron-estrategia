package main;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class LoadRemoteData implements ILoadDataStrategy {

    @Override
    public List<String[]> loadStrategy(String url) throws IOException, CsvException {
        List<String[]> aux;
        URL stockURL = new URL(url);
        BufferedReader in = new BufferedReader(new InputStreamReader(stockURL.openStream()));
        CSVReader reader = new CSVReader(in);
        aux = reader.readAll();
        return aux;

    }
}
