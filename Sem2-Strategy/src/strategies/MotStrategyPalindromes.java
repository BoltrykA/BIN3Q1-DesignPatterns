package strategies;

import java.util.StringTokenizer;

public class MotStrategyPalindromes implements ListeMotStrategy {
    @Override
    public void verifierCondition(String ligne) {
        StringTokenizer mots = new StringTokenizer(ligne, " \t.;(){}\"'*=:!/\\");
        while (mots.hasMoreTokens()) {
            String mot = mots.nextToken();
            if (estPalindrome(mot))
                System.out.println(mot);
        }
    }

    private boolean estPalindrome(String mot) {
        if (mot == null)
            return false;
        StringBuffer stringbuffer = new StringBuffer(mot);
        return mot.equals(stringbuffer.reverse().toString());
    }
}
