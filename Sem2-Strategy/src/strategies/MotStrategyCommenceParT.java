package strategies;

import java.util.StringTokenizer;

public class MotStrategyCommenceParT implements ListeMotStrategy {
    @Override
    public void verifierCondition(String ligne) {
        StringTokenizer mots = new StringTokenizer(ligne, " \t.;(){}\"'*=:!/\\");
        while (mots.hasMoreTokens()) {
            String mot = mots.nextToken();
            if (mot.charAt(0) == 't' || mot.charAt(0) == 'T')
                System.out.println(mot);
        }
    }
}
