package main;


public class CSVReader {

    private String filename;
    private String filecontents;
    private char separator = ',';

    public CSVReader(String filename, String filecontents) {
        this.filename = filename;
        this.filecontents = filecontents;
    }

    public CSVReader(String filename, String filecontents, char separator) {
        this(filename, filecontents);
        this.separator = separator;
    }

    public CSVFile parseContents(String csvContents) {
        // Do parsing
        String[] dummy = {"headers", "record00", "record01", "..."};
        return new CSVFile(dummy);
    }
}
