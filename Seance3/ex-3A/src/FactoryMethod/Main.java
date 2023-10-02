package FactoryMethod;

public class Main {

  public static void main(String[] args) {
    Magasin m = new MagasinDeDVD();
    m.ajouterProduit("dvd1", 2017);
    m.ajouterProduit("dvd2", 2018);
    System.out.println(m.retourneProduit("dvd1").toString());

    Magasin m2 = new MagasinDeLivre();
    m2.ajouterProduit("livre1", 1999);
    System.out.println(m2.retourneProduit("livre1").toString());
  }

}
