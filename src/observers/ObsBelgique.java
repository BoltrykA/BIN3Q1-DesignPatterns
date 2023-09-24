package observers;

public class ObsBelgique implements Observer {
  private int nbBelgique;

  @Override
  public void traiterLigne(String ligne) {
    if (ligne.contains("Belgique")) {
      nbBelgique++;
    }
  }

  public void donnerResultat() {
    System.out.println("Il y a " + nbBelgique + " occurrences du mot 'Belgique'");
  }
}
