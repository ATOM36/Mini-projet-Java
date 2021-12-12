package models.dal;

import interfaces.IOperationBancaire;
import models.entity.DataBase;
import models.entity.OperationBancaire;

import java.util.ArrayList;

public abstract class DAL_OperationBancaire extends IOperationBancaire {

    public static OperationBancaire getOperation(long operationID) {
        OperationBancaire result = null;
        int i = 0;
        while (i < DataBase.operationBancaire.size() && result == null) {
            if (DataBase.operationBancaire.get(i).operationID == (operationID)) {
                result = DataBase.operationBancaire.get(i);
            } else i++;
        }
        return result;
    }

    public static ArrayList<OperationBancaire> getAllOperation() {
        return DataBase.operationBancaire;
    }

    public static ArrayList<OperationBancaire> getOperationByClient(long clientID) {
        ArrayList<OperationBancaire> result = new ArrayList<OperationBancaire>();
        int i = 0;

        while (i < DataBase.operationBancaire.size()) {
            if (DataBase.operationBancaire.get(i).operationID == clientID)
                result.add(DataBase.operationBancaire.get(i));
            i++;
        }

        return result;
    }

    public static ArrayList<OperationBancaire> getOperationByAgent(long banquierID) {
        ArrayList<OperationBancaire> result = new ArrayList<OperationBancaire>();
        int i = 0;

        while (i < DataBase.operationBancaire.size()) {
            if (DataBase.operationBancaire.get(i).operationID == banquierID)
                result.add(DataBase.operationBancaire.get(i));
            i++;
        }

        return result;
    }


    public static void ajouterOperation(OperationBancaire operation) {
        try {
            DataBase.operationBancaire.add(operation);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    public static boolean supprimerOperation(OperationBancaire operation) {
        try {
            DataBase.operationBancaire.remove(operation);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean updateOperation(long operationID, OperationBancaire operation) {
        try {
            DataBase.operationBancaire.set(DataBase.operationBancaire.indexOf(getOperation(operationID)), operation);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
