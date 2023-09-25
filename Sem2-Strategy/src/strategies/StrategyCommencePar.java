package strategies;

public class StrategyCommencePar implements MotStrategy {
    private final char ch;
    public StrategyCommencePar(char ch){
        this.ch = ch;

    }
    @Override
    public boolean verifierCondition(String mot) {
        return (mot.charAt(0) == ch);
    }
}
