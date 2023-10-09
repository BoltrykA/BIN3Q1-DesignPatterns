package AbstractFactory;

import java.util.HashMap;
import java.util.Map;

public class Magasin {
	private AbstractFactory factory;
	private Map<String, Produit> bac= new HashMap<>();

	public Magasin(AbstractFactory factory){
		this.factory = factory;
	}

	public void ajouterProduit(String name, int anneeDeParution){
		Produit p = factory.creerProduit(name, anneeDeParution);
		bac.put(name,p);
	}
	public Produit retourneProduit(String name){
		return bac.get(name);
	}
}
