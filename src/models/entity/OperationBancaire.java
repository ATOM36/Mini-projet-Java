package models.entity;

public class OperationBancaire {
    private static long id;
    public long operationID;
    public double montant = 0;
    public String dateOperation;
    public long historiqueID;
    public TypeOperation type;

    public OperationBancaire(String date,double montant,long historiqueID){
        this.dateOperation = date;
        this.montant = montant;
        this.historiqueID = historiqueID;
    }

}
