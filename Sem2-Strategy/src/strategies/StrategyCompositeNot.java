package strategies;

public class StrategyCompositeNot implements MotStrategy {
    private final MotStrategy strat;
    public StrategyCompositeNot(MotStrategy strat){
        this.strat = strat;
    }
    @Override
    public boolean verifierCondition(String mot) {
        return (!strat.verifierCondition(mot));
    }
}
