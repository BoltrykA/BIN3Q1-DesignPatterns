package AbstractFactory;

public class Main {

  public static void main(String[] args) {
    AbstractFactory factoryDVD = new DVDFactory();
    Magasin m = new Magasin(factoryDVD);
    m.ajouterProduit("dvd1", 2017);
    m.ajouterProduit("dvd2", 2018);
    System.out.println(m.retourneProduit("dvd1").toString());

    AbstractFactory factoryLivre = new LivreFactory();
    Magasin m2 = new Magasin(factoryLivre);
    m2.ajouterProduit("livre1", 1999);
    System.out.println(m2.retourneProduit("livre1").toString());
  }

}
