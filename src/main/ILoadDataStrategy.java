package main;

import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

public interface ILoadDataStrategy {

    List<String[]> loadStrategy(String url) throws IOException, CsvException;

}
