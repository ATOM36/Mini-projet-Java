package controllers;

import java.util.ArrayList;

import models.bll.BLL_Client;
import models.dal.DAL_Client;
import models.entity.Client;

public class ClientController {

	public static Client getClient(long clientID) {
		return DAL_Client.getClient(clientID);
    }
	
	
    public static ArrayList<Client> getAllClient() {
        return BLL_Client.getAllClient();
    }
    
    
    public static  ArrayList<Client> getAllClient(long banquierID) {
		return BLL_Client.getAllClient(banquierID);
    }
    
    
    public static boolean ajouterClient(Client lambda) {
		return BLL_Client.ajouterClient(lambda);
    }
    
    
    public static boolean supprimerClient(Client lambda) {
		return BLL_Client.supprimerClient(lambda);
    }
    
    
    public static boolean supprimerClient(long clientID) {
		return BLL_Client.supprimerClient(clientID);
    }
    
    
    public static boolean updateClient(long clientID, Client lambda) {

    	return BLL_Client.updateClient(clientID, lambda);
		
    }
    
}
