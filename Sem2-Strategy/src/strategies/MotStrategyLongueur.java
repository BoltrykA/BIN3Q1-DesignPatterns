package strategies;

import java.util.StringTokenizer;

public class MotStrategyLongueur implements ListeMotStrategy {
    private final int longueur;

    public MotStrategyLongueur(int longueur){
        this.longueur = longueur;
    }


    @Override
    public void verifierCondition(String ligne) {
        StringTokenizer mots = new StringTokenizer(ligne, " \t.;(){}\"'*=:!/\\");
        while (mots.hasMoreTokens()) {
            String mot = mots.nextToken();
            if (mot.length() == longueur)
                System.out.println(mot);
        }
    }
}
