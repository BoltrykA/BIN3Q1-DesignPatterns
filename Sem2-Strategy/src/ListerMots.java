import strategies.ListeMotStrategy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ListerMots {
    private String fichier;

    public ListerMots(String fichier) {
        this.fichier = fichier;
    }

    public void traitement(ListeMotStrategy ls) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(this.fichier));
        String buffer = null;
        while ((buffer = input.readLine()) != null) {
            ls.verifierCondition(buffer);
            }
        }
    }

