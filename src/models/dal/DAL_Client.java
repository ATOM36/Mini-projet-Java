package models.dal;


import interfaces.IClient;
import models.entity.Client;
import models.entity.DataBase;

import java.util.ArrayList;

public abstract class DAL_Client extends IClient {

    public static Client getClient(long clientID) {
        Client result = null;
        int i = 0;

        while ((i < DataBase.client.size()) && (result == null)) {
            if (DataBase.client.get(i).myID == clientID)
                result = DataBase.client.get(i);
            else
                i++;
        }

        return result;
    }

    public static ArrayList<Client> getAllClient() {
        return DataBase.client;
    }

    public static ArrayList<Client> getAllClient(long banquierID) {
        ArrayList<Client> result = new ArrayList<Client>();
        int i = 0;

        while (i < DataBase.client.size()) {
            if (DataBase.client.get(i).banquierID == banquierID)
                result.add(DataBase.client.get(i));
            i++;
        }

        return result;
    }

    public static boolean ajouterClient(Client lambda) {
        try {
            DataBase.client.add(lambda);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }


    public static boolean supprimerClient(Client lambda) {
        try {
            DataBase.client.remove(lambda);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }


    public static boolean supprimerClient(long clientID) {
        try {
            DataBase.client.remove(DataBase.client.indexOf(getClient(clientID)));
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean updateClient(long clientID, Client lambda) {
        try {
            DataBase.client.set(DataBase.client.indexOf(getClient(clientID)), lambda);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
