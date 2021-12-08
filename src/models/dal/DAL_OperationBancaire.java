package models.dal;

import models.entity.OperationBancaire;

import java.util.ArrayList;

public class DAL_OperationBancaire {

    public static OperationBancaire getOperation(long operationID){
        return null;
    }

    public static ArrayList<OperationBancaire> getAllOperation(){
        return null;
    }

    public static ArrayList<OperationBancaire> getOperationByClient(long clientID){
        return null;
    }

    public static ArrayList<OperationBancaire> getOperationByAgent(long banquierID){
        return null;
    }

    public static void ajouterOperation(OperationBancaire operation){

    }

    public static boolean supprimerOperation(long operationID){
        return false;
    }

    public static boolean updateOperation(long operationID, OperationBancaire operation){
        return false;
    }
}
