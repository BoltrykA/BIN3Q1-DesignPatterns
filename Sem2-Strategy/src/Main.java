import strategies.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DecoratorCompteurDeMots ms = new DecoratorCompteurDeMots(new StrategyCommencePar('t'));
        ListerMots lm = new ListerMots("text.txt");
        lm.traitement(ms);
        System.out.println(ms.getCompteur());
    }
}
