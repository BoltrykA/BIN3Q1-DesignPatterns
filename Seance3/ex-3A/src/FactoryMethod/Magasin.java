package FactoryMethod;

import java.util.HashMap;
import java.util.Map;

public abstract class Magasin {
    private Map<String, Produit> bac = new HashMap<>();

    public void ajouterProduit(String name, int anneeDeParution) {
        Produit p = creerProduit(name, anneeDeParution);
        bac.put(name, p);
    }

    protected abstract Produit creerProduit(String name, int anneeDeParution);

    public Produit retourneProduit(String name) {
        return bac.get(name);
    }
}
