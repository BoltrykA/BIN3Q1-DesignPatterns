package observers;

public class ObsLigne implements Observer {
  private int nbLignes;

  @Override
  public void traiterLigne(String ligne) {
    nbLignes++;
  }

  @Override
  public void donnerResultat() {
    System.out.println("Il y a " + nbLignes + " lignes.");
  }
}
