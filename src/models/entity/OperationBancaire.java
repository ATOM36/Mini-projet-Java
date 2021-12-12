package models.entity;

public class OperationBancaire {
    private static long id = 1;
    public long operationID;
    public double montant = 0;
    public String dateOperation;
    public long historiqueID;
    public TypeOperation type;

    public OperationBancaire(String date, double montant, long historiqueID) {
        operationID = id++;
        this.dateOperation = date;
        this.montant = montant;
        this.historiqueID = historiqueID;
    }

    @Override
    public String toString() {
        return "[operationID= " + operationID + ", montant= " + montant + ", dateOperation= " + dateOperation + ", historiqueID= " + historiqueID + ", type= " + type + " ]";
    }

}
