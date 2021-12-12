package views;

import controllers.ClientController;
import models.entity.Banquier;
import models.entity.Client;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewBanquier {
    private Banquier model;
    private Scanner scanner;
    private boolean onRun = true;


    public ViewBanquier(Banquier model) {
        this.model = model;
        this.scanner = new Scanner(System.in);
        System.out.println("\n\nBienvenue " + model.nom + " " + model.prenom);
        run();
    }


    private void run() {


        while (onRun) {
            System.out.println("\n\n0: Consulter les informations d'un client\n1: Consulter les informations de tous les clients\n" +
                    "2: Voir tous les clients que vous suivez\n3: Ajouter un client\n4: Supprimer un client\n5: Mettre à" +
                    "les informations d'un client\n6: Mettre à jour vos informations personnelles\n7: Se deconnecter");

            int action;

            do {
                action = scanner.nextInt();
                if ((action < 0) || (action > 7))
                    System.out.println("Entrée invalide");
            } while ((action < 0) || (action > 7));

            switch (action) {
                case 0:
                    getClient(scanner);
                    break;
                case 1:
                    getAllClient();
                    break;
                case 2:
                    getClient();
                    break;
                case 3:
                    ajouterClient();
                    break;
                case 4:
                    supprimerClient(scanner);
                    break;
                case 5:
                    updateClient();
                    break;
                case 6:
                    updateBanquier();
                    break;
                default:
                    logOut(scanner);
            }

        }

        System.out.println("Aurevoir !!");
        Login.run();
    }


    private void getClient(Scanner in) {
        System.out.println("Donner l'identifiant du client");
        int clientID = in.nextInt();
        Client result = ClientController.getClient(clientID);

        if (result == null)
            System.out.println("Erreur! Ce client n'existe pas");
        else
            System.out.println(result.toString());
    }

    private void getAllClient() {
        ArrayList<Client> result = ClientController.getAllClient();

        if (result == null)
            System.out.println("Il n'y a aucun client");
        else {
            for (Client c : result)
                System.out.println(c.toString() + "\n");
        }
    }

    //Retourne les clients suivis par ce banquier
    private void getClient() {
        ArrayList<Client> result = ClientController.getAllClient(model.myID);

        if (result == null)
            System.out.println("Vous ne suivez aucun client");
        else {
            for (Client c : result)
                System.out.println(c.toString() + "\n");
        }
    }

    private void ajouterClient() {

    }

    private void supprimerClient(Scanner in) {
        System.out.println("Donner l'identifiant du client");
        int clientID = in.nextInt();
        boolean answer = ClientController.supprimerClient(clientID);
        if (answer)
            System.out.println("Suppression effectuée avec succès");
        else
            System.out.println("Opération non validée");

    }

    private void updateClient() {

    }

    private void updateBanquier() {

    }

    private void logOut(Scanner in) {
        System.out.println("Etes-vous sûr de vouloir quitter l'application ?");
        System.out.println("\nTapez 0 pour annuler\nTapez 1 pour vous déconnecter");

        int action;

        do {
            action = scanner.nextInt();
            if ((action < 0) || (action > 7))
                System.out.println("Entrée invalide");
        } while ((action < 0) || (action > 7));


        if (action == 1)
            onRun = false;
    }

}
