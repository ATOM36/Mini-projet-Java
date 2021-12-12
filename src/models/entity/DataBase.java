package models.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class DataBase {
    public static ArrayList<Client> client = new ArrayList<Client>(Arrays.asList(new Client("Aholia", "Mohamed", "ci200008", "omrane", "mohamedaholia@gmail.com", "52358917", 1000, 145)));
    public static ArrayList<Banquier> banquier = new ArrayList<Banquier>();
    public static ArrayList<Historique> historique = new ArrayList<Historique>(Arrays.asList(new Historique(75, 50, 879)));
    public static ArrayList<OperationBancaire> operationBancaire = new ArrayList<OperationBancaire>(Arrays.asList(new OperationBancaire("14/08/2000", 895, 5893)));
    public static ArrayList<CompteEpargne> compteEpargne = new ArrayList<CompteEpargne>(Arrays.asList(new CompteEpargne(87, 45, 5689, "07117894")));
    public static ArrayList<CompteCourant> compteCourant = new ArrayList<CompteCourant>(Arrays.asList(new CompteCourant(587, 5897, 5897, "564798", 25)));
    public static ArrayList<Directeur> directeur = new ArrayList<Directeur>(Arrays.asList(new Directeur("mark", "elon", "548", "evry", "elonmark@gmail.com", "05487974", 458, "aze", "rezo")));

    public static void load() {
        banquier.add(new Banquier("abdoul", "garba", "ci5000", "omrane", "abdoulgarba.com", "54879654", 4856, "aze", "grizou"));
    }
}
