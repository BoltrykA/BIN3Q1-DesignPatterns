package AbstractFactory;

public abstract class Produit {
  private String name;
  private int anneeDeParution;
  private double prix;
  public Produit(String name, int anneeDeParution, double prix){
    this.name=name;
    this.anneeDeParution=anneeDeParution;
    this.prix=prix;
  }
  public String getName() {
    return name;
  }
  public int getAnneeDeParution() {
    return anneeDeParution;
  }
  public double getPrix() {
    return prix;
  }
  public void setPrix(int prix){
    this.prix=prix;
  }

  @Override
  public String toString() {
    return "Produit qui s'appelle " + this.name + " manufacturé en " + this.anneeDeParution +
        " au prix de " + this.prix + "euros ou dollars je sais pas";
  }
}
