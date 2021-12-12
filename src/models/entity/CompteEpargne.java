package models.entity;

public class CompteEpargne extends CompteBancaire {

    public final int FRAIS_TENUE_COMPTE = 10;

    public CompteEpargne(long clientID, long employeID, double solde, String password) {
        super(clientID, employeID, solde, password);
    }

    public String toString() {
        return "Compte epargne[" + super.toString() + ",Solde= " + solde + " Password= " + password + " ClientID= " +
                clientID + " EmployeID= " + employeID + " FraisTenueCompte= " + FRAIS_TENUE_COMPTE + "]";
    }
}
