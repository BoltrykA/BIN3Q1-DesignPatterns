package FactoryMethod;

import java.util.HashMap;
import java.util.Map;

public abstract class Magasin {
	protected Map<String, Produit> bac;

  public Magasin() {
    bac = new HashMap<>();
  }

  protected abstract void ajouterProduit(String name, int anneeDeParution); // Override pour chaque type de product
	public Produit retourneProduit(String name){
		return bac.get(name);
	}
}
