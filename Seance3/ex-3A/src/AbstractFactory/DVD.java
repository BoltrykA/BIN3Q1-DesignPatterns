package AbstractFactory;

public class DVD extends Produit {
	public static final double PRIX=19.99;
	public DVD(String name, int anneeDeParution) {
		super(name, anneeDeParution, PRIX);
	}

	
}
