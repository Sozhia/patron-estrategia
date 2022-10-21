package main;

import java.util.ArrayList;

public class CSVFile {
    private String headers;
    private ArrayList<String> records;

    private Integer currentObject = 0;

    public CSVFile(String[] rawContent) {
        headers = rawContent[0];

        records = new ArrayList<String>();
        for (int i = 1; i < rawContent.length; i++) {
            records.add(rawContent[i]);
        }
    }

    public void partialPrint(int n) {
        System.out.println(headers);
        int i = 0;
        for (String s : records) {
            System.out.println((i + 1) + " " + records.get(i));
            i++;
            if (i == n)
                break;
        }
    }
}
