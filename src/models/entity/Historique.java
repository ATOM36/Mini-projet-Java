package models.entity;

public class Historique {
    private static long id = 1;
    public long historiqueID;
    public long compteID;
    public long clientID;
    public long banquierID;

    public Historique(long clientID, long banquierID, long compteID) {
        historiqueID = id++;
        this.clientID = clientID;
        this.compteID = compteID;
        this.banquierID = banquierID;
    }

    @Override
    public String toString() {
        return "Historique [ historiqueID = " + historiqueID + ", compteID = " + compteID + ", clientID = " +
                clientID + ", banquier ID = " + banquierID + " ]";
    }
}
