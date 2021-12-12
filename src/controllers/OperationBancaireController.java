package controllers;

import java.util.ArrayList;

import interfaces.IOperationBancaire;
import models.bll.BLL_OperationBancaire;
import models.entity.OperationBancaire;

public class OperationBancaireController extends IOperationBancaire{

    public static OperationBancaire getOperation(long operationID){
    	    return BLL_OperationBancaire.getOperation(operationID);
  
    }

    public static ArrayList<OperationBancaire> getAllOperation(){
        return BLL_OperationBancaire.getAllOperation();
    }

    public static ArrayList<OperationBancaire> getOperationByClient(long clientID){

    	    return BLL_OperationBancaire.getOperationByClient(clientID);
 	
     
    }
    
    public static ArrayList<OperationBancaire> getOperationByAgent(long banquierID){

    	    return BLL_OperationBancaire.getOperationByAgent(banquierID);
    	
    }

    public static void ajouterOperation(OperationBancaire operation){
    
    		BLL_OperationBancaire.ajouterOperation(operation);
    }
    
    public static boolean supprimerOperation(OperationBancaire operation){
    
    		return BLL_OperationBancaire.supprimerOperation(operation);
    		
    }
    public static boolean updateOperation(long operationID, OperationBancaire operation){
    	return BLL_OperationBancaire.updateOperation(operationID,operation);
    }
}
