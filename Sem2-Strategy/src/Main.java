import strategies.MotStrategyLongueur;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ListerMots lm = new ListerMots("text.txt");
        lm.traitement(new MotStrategyLongueur(3));
    }
}
