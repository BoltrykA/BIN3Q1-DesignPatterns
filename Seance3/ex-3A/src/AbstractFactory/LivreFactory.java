package AbstractFactory;

public class LivreFactory implements AbstractFactory{

  @Override
  public Produit creerProduit(String name, int anneeDeParution) {
    return new Livre(name, anneeDeParution);
  }
}
