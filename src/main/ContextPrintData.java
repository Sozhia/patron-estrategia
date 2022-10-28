package main;

import org.jfree.data.general.Dataset;

public class ContextPrintData {

    private IPrintStrategy printDataStrategy;

    public ContextPrintData(IPrintStrategy printDataStrategy) {
        this.printDataStrategy = printDataStrategy;
    }

    public void executeStrategy(DataSet dataset) {
        printDataStrategy.printDiagram(dataset);
    }
}
