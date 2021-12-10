package models.dal;


import interfaces.IClient;
import models.entity.Client;
import models.entity.DataBase;

import java.util.ArrayList;

public class DAL_Client implements IClient {

    @Override
    public Client getClient(long clientID) {
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

    @Override
    public ArrayList<Client> getAllClient() {
        return DataBase.client;
    }

    /***
     * Retourne tous les clients suivis par un banquier donné
     * @param banquierID
     * @return
     */
    @Override
    public ArrayList<Client> getAllClient(long banquierID) {
        ArrayList<Client> result = new ArrayList<Client>();
        int i = 0;

        while (i < DataBase.client.size()) {
            if (DataBase.client.get(i).banquierID == banquierID)
                result.add(DataBase.client.get(i));
            i++;
        }

        return result;
    }

    @Override
    public boolean ajouterClient(Client lambda) {
        try {
            DataBase.client.add(lambda);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    /***
     * Supprime le client passé en paramètre
     * @param lambda
     * @return
     */
    @Override
    public boolean supprimerClient(Client lambda) {
        try {
            DataBase.client.remove(lambda);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    /***
     * Supprime le client dont la référence a été passée en paramètre
     * @param clientID
     * @return
     */
    @Override
    public boolean supprimerClient(long clientID) {
        try {
            DataBase.client.remove(DataBase.client.indexOf(getClient(clientID)));
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateClient(long clientID, Client lambda) {
        try {
            DataBase.client.set(DataBase.client.indexOf(getClient(clientID)), lambda);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
