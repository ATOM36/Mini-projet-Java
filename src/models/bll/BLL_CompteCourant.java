package models.bll;

import java.util.ArrayList;

import interfaces.ICompteCourant;
import models.dal.DAL_CompteCourant;
import models.entity.CompteCourant;
import models.entity.DataBase;

public abstract class BLL_CompteCourant extends ICompteCourant {
	 public static CompteCourant getCompte(long compteID){
		 return DAL_CompteCourant.getCompte(compteID);
	 }  
	
	 public static CompteCourant getCompte(long compteID, long clientID){
	     return DAL_CompteCourant.getCompte(compteID, clientID);
	 }
	
	 public static ArrayList<CompteCourant> getAllCompte(){
	 	return DAL_CompteCourant.getAllCompte();
	 }
	 public static ArrayList<CompteCourant> getAllCompte(long clientID){
	     return DAL_CompteCourant.getAllCompte(clientID);
	 }
	
	 public static boolean ajouterCompte(CompteCourant compte){
		boolean b=false; 
	 	if(compte==null) {
	 		DAL_CompteCourant.ajouterCompte(compte);
	 		b=true;
	 	}
		return b;
	 }
	
	 public static boolean supprimerCompte(long compteID){
		 boolean b=false; 
		 	if(compteID>0) {
		 		DAL_CompteCourant.supprimerCompte(compteID);
		 		b=true;
		 	}
			return b;
	 }
	
	 public static boolean updateCompte(long compteID,CompteCourant compte){
		 boolean b=false; 
		 	if(compte.clientID>0) {
		 		DAL_CompteCourant.updateCompte(compteID,compte);
		 		b=true;
		 	}
			return b;
	 }
}
