package main;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DataSet {

    protected List<String[]> data;

    DataSet (String url, ContextLoadData loadDataStrategy) throws IOException, CsvException {
        List<String[]> aux = loadDataStrategy.executeStrategy(url);
        this.data = loadDataStrategy.executeStrategy(url);
        for (int i = 0 ; i < this.data.size() ; i++) {
            if (Objects.equals(aux.get(i)[0], "TF") || Objects.equals(aux.get(i)[0], "GC")) {
                this.data.add(aux.get(i));
                System.out.println(Arrays.toString(aux.get(i)));
            }
        }
    }

    void printData(){
        for (String[] row : data) {
            for (String cell : row)
                System.out.print(cell + "\t");
            System.out.println();
        }
    }

    public List<String[]> getData() { return data; }

}
