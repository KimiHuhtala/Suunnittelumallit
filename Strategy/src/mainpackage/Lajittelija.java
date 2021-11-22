package mainpackage;

public class Lajittelija {
    private ILajittele strategy;

    public Lajittelija(ILajittele strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(int[] tableToBeSorted){
        strategy.sort(tableToBeSorted);
    }

    public void setStrategy(ILajittele strategy) {
        this.strategy = strategy;
    }
}
