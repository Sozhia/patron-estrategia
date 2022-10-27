package main;

import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.util.List;

public class ContextLoadData {

    private ILoadDataStrategy loadDataStrategy;

    public ContextLoadData(ILoadDataStrategy loadDataStrategy) {
        this.loadDataStrategy = loadDataStrategy;
    }

    public List<String[]> executeStrategy (String url) throws IOException, CsvException {
        return loadDataStrategy.loadStrategy(url);
    }
}
