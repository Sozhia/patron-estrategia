package main;



public class LoadDataFactory {

    public static ILoadDataStrategy createLoadDataStrategy(LoadDataStrategyType type) {
        return switch (type) {
            case LOCAL -> new LoadLocalData();
            case REMOTE -> new LoadRemoteData();
        };
    }
}
