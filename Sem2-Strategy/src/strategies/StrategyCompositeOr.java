package strategies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrategyCompositeOr implements MotStrategy {
    private final List<MotStrategy> strategies = new ArrayList<>();

    public StrategyCompositeOr(MotStrategy...strategies){
        this.strategies.addAll(Arrays.asList(strategies));
    }

    @Override
    public boolean verifierCondition(String mot) {
        for (MotStrategy str : strategies){
            if (str.verifierCondition(mot)) return true;
        }
        return false;
    }
}
