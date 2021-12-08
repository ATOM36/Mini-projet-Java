package models.entity;

public class CompteEpargne extends CompteBancaire{

    public final int fraisTenueCompte = 10;

    public CompteEpargne(long clientID, long employeID, double solde, String password) {
        super(clientID, employeID, solde, password);
    }
}
