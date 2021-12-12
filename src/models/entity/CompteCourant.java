package models.entity;

public class CompteCourant extends CompteBancaire {

    public final int FRAIS_TENUE_COMPTE = 25;
    public float tauxInteret;

    public CompteCourant(long clientID, long employeID, double solde, String password, float tauxInteret) {
        super(clientID, employeID, solde, password);
        this.tauxInteret = tauxInteret;
    }

    public String toString() {
        return "Compte courant [" + super.toString() + ",Solde= " + solde + " Password= " + password + " ClientID= " +
                clientID + " EmployeID= " + employeID + "TauxInteret= " + tauxInteret + " FraisDeTenueCompte= " +
                FRAIS_TENUE_COMPTE + "]";
    }

}
    
