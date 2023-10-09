package FactoryMethod;

import java.util.Map;

public class MagasinDeDVD extends Magasin {

    @Override
    protected Produit creerProduit(String name, int anneeDeParution) {
        return new DVD(name, anneeDeParution);
    }
}
