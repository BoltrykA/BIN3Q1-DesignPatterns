package strategies;

public class StrategyLongueur implements MotStrategy {
    private final int longueur;

    public StrategyLongueur(int longueur){
        this.longueur = longueur;
    }

    @Override
    public boolean verifierCondition(String mot) {
            return mot.length() == longueur;
    }
}
