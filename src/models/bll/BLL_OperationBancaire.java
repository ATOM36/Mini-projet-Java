package models.bll;
import java.util.ArrayList;

import interfaces.IOperationBancaire;
import models.dal.DAL_OperationBancaire;
import models.entity.OperationBancaire;

public abstract class BLL_OperationBancaire extends IOperationBancaire {

    public static OperationBancaire getOperation(long operationID){
    	if(operationID<=0) {
    	    return DAL_OperationBancaire.getOperation(operationID);
    	}
    	else {
    		return null;
    	}
		
     
    }

    public static ArrayList<OperationBancaire> getAllOperation(){
        return DAL_OperationBancaire.getAllOperation();
    }

    public static ArrayList<OperationBancaire> getOperationByClient(long clientID){
    	if(clientID<=0) {
    	    return DAL_OperationBancaire.getOperationByClient(clientID);
    	}
    	else {
    		return null;
    	}
		
     
    }
    
    public static ArrayList<OperationBancaire> getOperationByAgent(long banquierID){
    	if(banquierID<=0) {
    	    return DAL_OperationBancaire.getOperationByAgent(banquierID);
    	}
    	else {
    		return null;
    	}
		
     
   
    }

    public static void ajouterOperation(OperationBancaire operation){
    	if(operation.operationID>0) {
    		DAL_OperationBancaire.ajouterOperation(operation);
    	}
    }

    public static boolean supprimerOperation(OperationBancaire operation){
    	if(operation.operationID>0) {
    		DAL_OperationBancaire.supprimerOperation(operation);
    		return true;
    	}
    	else {
    		 return false;
    	}
       
    }
    public static boolean updateOperation(long operationID, OperationBancaire operation){
    	return DAL_OperationBancaire.updateOperation(operationID,operation);
    }
}
