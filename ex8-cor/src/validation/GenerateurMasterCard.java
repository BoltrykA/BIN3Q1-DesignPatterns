package validation;

import domaine.CarteDeCredit;
import domaine.MasterCard;

import java.util.Calendar;

public class GenerateurMasterCard extends Generateur {

    public GenerateurMasterCard(Generateur successeur) {
        super(successeur);
    }

    @Override
    public boolean valider(String numero) {
        return (numero.matches("^5[1-5]\\w{14}$"));
    }

    @Override
    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
        if (valider(numero)){
            return new MasterCard(numero, dateExpiration, nom);
        }
        else return super.creerCarte(numero, dateExpiration, nom);
    }
}
