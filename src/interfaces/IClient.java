package interfaces;

import models.entity.Client;

import java.util.ArrayList;

public interface IClient {
    Client getClient(long clientID);

    ArrayList<Client> getAllClient();

    ArrayList<Client> getAllClient(long banquierID);

    boolean ajouterClient(Client lamba);

    boolean supprimerClient(Client lambda);

    boolean supprimerClient(long clientID);

    boolean updateClient(long clientID, Client lambda);

}
