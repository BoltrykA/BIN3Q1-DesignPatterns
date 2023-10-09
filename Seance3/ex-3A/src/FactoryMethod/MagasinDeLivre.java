package FactoryMethod;

public class MagasinDeLivre extends Magasin {

    @Override
    protected Produit creerProduit(String name, int anneeDeParution) {
        return new Livre(name, anneeDeParution);
    }
}
