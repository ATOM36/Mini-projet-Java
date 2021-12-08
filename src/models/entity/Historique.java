package models.entity;

public class Historique {
    private static long id;
    public long historiqueID;
    public long compteID;
    public long clientID;

    public Historique(long clientID, long compteID) {
        historiqueID = id++;
        this.clientID = clientID;
        this.compteID = compteID;
    }
}
