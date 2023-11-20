package validation;

import domaine.CarteDeCredit;
import domaine.MasterCard;
import domaine.Visa;

import java.util.Calendar;

public class GenerateurVisa extends Generateur {

    public GenerateurVisa(Generateur successeur) {
        super(successeur);
    }

    @Override
    public boolean valider(String numero) {
       return (numero.startsWith("4") && numero.length() == 16);
    }

    @Override
    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
        if (valider(numero)){
            return new Visa(numero, dateExpiration, nom);
        }
        else return super.creerCarte(numero, dateExpiration, nom);
    }
}
