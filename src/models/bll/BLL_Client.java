package models.bll;

import java.util.ArrayList;

import interfaces.IClient;
import models.dal.DAL_Client;
import models.entity.Client;


public class BLL_Client extends IClient{
	public static Client getClient(long clientID) {
		if(clientID>0)
		return DAL_Client.getClient(clientID);
		return null;
    }
	
	
    public static ArrayList<Client> getAllClient() {
        return DAL_Client.getAllClient();
    }
    
    
    public static  ArrayList<Client> getAllClient(long banquierID) {
    	if(banquierID>0)
		return DAL_Client.getAllClient(banquierID);
		return null;
    }
    
    
    public static boolean ajouterClient(Client lambda) {
    	if(lambda!=null)
		return DAL_Client.ajouterClient(lambda);
		return false;
    }
    
    
    public static boolean supprimerClient(Client lambda) {
    	if(lambda!=null)
		return DAL_Client.supprimerClient(lambda);
		return false;
    }
    
    
    public static boolean supprimerClient(long clientID) {
    	if(clientID>0)
		return DAL_Client.supprimerClient(clientID);
		return false;
    }
    
    
    public static boolean updateClient(long clientID, Client lambda) {
    	if(lambda!=null&&clientID>0)
		return DAL_Client.updateClient(clientID, lambda);
		return false;
    }
    
	}
