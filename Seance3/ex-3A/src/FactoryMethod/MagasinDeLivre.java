package FactoryMethod;

public class MagasinDeLivre extends Magasin {

  @Override
  protected void ajouterProduit(String name, int anneeDeParution) {
    Produit p = new Livre(name,anneeDeParution);
    bac.put(name,p);
  }
}
