package strategies;

public class DecoratorCompteurDeMots implements MotStrategy {
    private MotStrategy decoratedStrat;
    private int compteur;

    public DecoratorCompteurDeMots(MotStrategy strat){
        this.decoratedStrat = strat;
        compteur = 0;
    }
    @Override
    public boolean verifierCondition(String mot) {
        boolean estValide = decoratedStrat.verifierCondition(mot);
        if (estValide) compteur++;
        return estValide;
    }

    public int getCompteur() {
        return compteur;
    }
}
