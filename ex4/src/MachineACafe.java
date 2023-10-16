public class MachineACafe {

  public enum State {
    PAS_ASSEZ {
      @Override
      public void entrerMonnaie(MachineACafe machine) {
        if (machine.boisson.getPrix() > machine.montantEnCours) {
          machine.afficherPasAssez(machine.boisson);
        } else {
          machine.montantEnCours -= machine.boisson.getPrix();
          machine.afficherBoisson(machine.boisson);
          machine.boisson = null;
          machine.afficherMontant();
          if (machine.montantEnCours == 0) {
            machine.setState(IDLE);
          } else {
            machine.setState(COLLECTE);
          }
        }
      }

      @Override
      public void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe machine) {
        throw new IllegalStateException();
      }

    }, COLLECTE {
      public void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe machine) {
        if (toucheBoisson.getPrix() > machine.montantEnCours) {
          machine.boisson = toucheBoisson;
          machine.afficherPasAssez(toucheBoisson);
          machine.boisson = toucheBoisson;
          machine.setState(PAS_ASSEZ);
          return;
        }
        machine.montantEnCours -= toucheBoisson.getPrix();
        machine.afficherBoisson(toucheBoisson);
        machine.afficherMontant();
        if (machine.montantEnCours == 0) {
          machine.setState(IDLE);
        } else {
          machine.setState(COLLECTE);
        }
      }

    }, IDLE {
      @Override
      public void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe machine) {
        machine.afficherPasAssez(toucheBoisson);
      }
    };

    public abstract void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe machine);

    public void entrerMonnaie(MachineACafe machine) {
      machine.setState(State.COLLECTE);
    }

    public void rendreMonnaie(MachineACafe machine) {
      machine.afficherRetour();
      machine.montantEnCours = 0;
      machine.boisson = null;
      machine.setState(IDLE);
    }
  }

  /*
   * ===================== DEBUT DE LA CLASSE MACHINEACAFE ====================================
   * */

  private int montantEnCours = 0;
  private State etatCourant;
  private ToucheBoisson boisson = null;

  public MachineACafe() {
    etatCourant = State.IDLE;
  }

  public void afficherMontant() {
    System.out.println(montantEnCours + " cents disponibles");
  }

  public void afficherRetour() {
    System.out.println(montantEnCours + " cents rendus");
  }

  public void afficherPasAssez(ToucheBoisson toucheBoisson) {
    System.out.println("Vous n'avez pas introduit un montant suffisant pour un " + toucheBoisson);
    System.out.println("Il manque encore " + (toucheBoisson.getPrix() - montantEnCours) + " cents");
  }

  public void afficherBoisson(ToucheBoisson toucheBoisson) {
    System.out.println("Voici un " + toucheBoisson);
  }

  public void entrerMonnaie(Piece piece) {
    montantEnCours += piece.getValeur();
    afficherMontant();
    etatCourant.entrerMonnaie(this);
  }

  public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
    etatCourant.selectionnerBoisson(toucheBoisson, this);
  }

  public void rendreMonnaie() {
    etatCourant.rendreMonnaie(this);
  }

  public void setState(State state) {
    this.etatCourant = state;
  }
}
