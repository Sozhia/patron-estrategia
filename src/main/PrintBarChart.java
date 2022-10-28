package main;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;

import java.awt.*;
import java.util.Arrays;

public class PrintBarChart implements IPrintStrategy {
    @Override
    public void printDiagram(DataSet dataset){

        Lienzo dialog = new Lienzo();


        double[] hospitales = new double[dataset.data.size()];

        for(int i = 0 ; i < dataset.data.size() ; i++){
            System.out.println(dataset.data.get(i).length);
        }

        HistogramDataset dataseth = new HistogramDataset();
        dataseth.addSeries("key",hospitales, 30);

        JFreeChart histograma = ChartFactory.createHistogram(
                "Histograma","Hospitales","Frecuencia",
                dataseth, PlotOrientation.VERTICAL,true,false,false);

        histograma.setBackgroundPaint(Color.white);
        ChartPanel panel = new ChartPanel(histograma);
        dialog.add(panel);
        dialog.pack();
        dialog.setVisible(true);
        panel.setVisible(true);


    }

}
