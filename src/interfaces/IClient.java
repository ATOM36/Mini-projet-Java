package interfaces;

import models.entity.Client;

import java.util.ArrayList;

public abstract class IClient {
    public static Client getClient(long clientID){
    	return null;
    }

    public static ArrayList<Client> getAllClient(){
    	return null;
    }

    public static ArrayList<Client> getAllClient(long banquierID){
    	return null;
    }

    public static boolean ajouterClient(Client lamba){
    	return false;
    }

    public static boolean supprimerClient(Client lambda){
    	return false;
    }

    public static boolean supprimerClient(long clientID){
    	return false;
    }

    public static boolean updateClient(long clientID, Client lambda){
    	return false;
    }

}
