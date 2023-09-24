package observers;

public class ObsMot implements Observer{
  private int nbMots;

  @Override
  public void traiterLigne(String ligne) {
    for (String mot : ligne.trim().split(" ")) {
      nbMots++;
    }
  }

  @Override
  public void donnerResultat() {
    System.out.println("Il y a " + nbMots + " mots dans le texte.");
  }
}
