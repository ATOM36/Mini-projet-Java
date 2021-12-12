package models.entity;

public abstract class CompteBancaire {
    protected static long id = 1;
    public long compteID;
    public double solde;
    public String password;
    public long clientID, employeID;

    public CompteBancaire(long clientID, long employeID, double solde, String password) {
        compteID = id++;
        this.clientID = clientID;
        this.employeID = employeID;
        this.solde = solde;
        this.password = password;
    }

    public String toString() {
        return "id=" + this.id + "CompteId= " + compteID + " Solde= " + solde + " Password= " + password + " ClientID= "
                + clientID + " EmployeID= " + employeID;
    }
}
