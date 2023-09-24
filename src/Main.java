import java.io.File;
import java.io.IOException;
import observers.ObsBelgique;
import observers.ObsLigne;
import observers.ObsMot;
import observers.ObsPalindrome;

public class Main {
  public static void main(String[] args) throws IOException {
    AnalyseurDeTexte analyseur = new AnalyseurDeTexte(new ObsBelgique(), new ObsLigne(), new ObsMot(), new ObsPalindrome());
    analyseur.lireFichier(new File("text.txt"));
    analyseur.donnerResultat();
  }
}