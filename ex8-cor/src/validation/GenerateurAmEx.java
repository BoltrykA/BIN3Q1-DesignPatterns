package validation;

import domaine.AmEx;
import domaine.CarteDeCredit;

import java.util.Calendar;

public class GenerateurAmEx extends Generateur {
    public GenerateurAmEx(Generateur successeur) {
        super(successeur);
    }

    @Override
    public boolean valider(String numero) {
        return ((numero.startsWith("34") || numero.startsWith("37")) && numero.length() == 15);
    }

    @Override
    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
        if (valider(numero)){
            return new AmEx(numero, dateExpiration, nom);
        }
        else return super.creerCarte(numero, dateExpiration, nom);
    }
}
