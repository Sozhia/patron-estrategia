package main;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.util.List;

public class LoadLocalData implements ILoadDataStrategy {

    @Override
    public List<String[]> loadStrategy(String url) {
        List<String[]> data = null;
        try{
            FileReader filereader = new FileReader(url);
            CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
            data = csvReader.readAll();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
