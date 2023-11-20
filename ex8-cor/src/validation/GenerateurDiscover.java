package validation;

import domaine.CarteDeCredit;
import domaine.Discover;

import java.util.Calendar;

public class GenerateurDiscover extends Generateur {
    public GenerateurDiscover(Generateur successeur) {
        super(successeur);
    }

    @Override
    public boolean valider(String numero) {
        return ((numero.startsWith("65") || numero.startsWith("6011")) && numero.length() == 16);
    }

    @Override
    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
        if (valider(numero)){
            return new Discover(numero, dateExpiration, nom);
        }
        else return super.creerCarte(numero, dateExpiration, nom);
    }
}
