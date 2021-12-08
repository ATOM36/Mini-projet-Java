package models.entity;

public class CompteCourant extends CompteBancaire {

    public final int fraisDeTenueCompte = 25;
    public float tauxInteret;

    public CompteCourant(long clientID, long employeID, double solde, String password, float tauxInteret) {
        super(clientID, employeID, solde, password);
        this.tauxInteret = tauxInteret;
    }
}
