package AbstractFactory;

public class DVDFactory implements AbstractFactory {
  @Override
  public Produit creerProduit(String name, int anneeDeParution) {
    return new DVD(name, anneeDeParution);
  }
}
