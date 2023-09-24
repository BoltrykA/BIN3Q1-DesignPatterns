import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import observers.Observer;


public class AnalyseurDeTexte {
	private List<Observer> observers = new ArrayList<>();

	public AnalyseurDeTexte(Observer ...observers){
		this.observers.addAll(Arrays.asList(observers));
	}

	public void lireFichier(File f) throws IOException {
		BufferedReader lecteurAvecBuffer = null;
		String ligne;
		try {
			lecteurAvecBuffer = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException(e.getMessage());
		}
		while ((ligne = lecteurAvecBuffer.readLine()) != null) {
			// ici ne lancer que le observers.traiterligne en foreach. LES OBSERVERS DOIVENT FAIRE LEUR TRAITEMENT DANS LA METHODE
			for (Observer o : observers){
				o.traiterLigne(ligne);
			}

		}
		lecteurAvecBuffer.close();
	}

	public void donnerResultat(){
		for (Observer o : observers){
			o.donnerResultat();
		}
	}
}
