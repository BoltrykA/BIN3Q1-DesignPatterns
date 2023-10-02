package FactoryMethod;

import java.util.Map;

public class MagasinDeDVD extends Magasin {

  @Override
  protected void ajouterProduit(String name, int anneeDeParution) {
    Produit p = new DVD(name,anneeDeParution);
    bac.put(name,p);
  }
}
