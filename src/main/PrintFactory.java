package main;

public class PrintFactory {
    public static IPrintStrategy createPrintStrategy(PrintStrategyType type) {
        return switch (type) {
            case BAR -> new PrintBarChart();
            case POINT_CLOUD -> new PrintPointCloud();
        };
    }
}
