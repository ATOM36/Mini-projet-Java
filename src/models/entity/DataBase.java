package models.entity;

import java.util.ArrayList;

public class DataBase {
    public static ArrayList<Client> client = new ArrayList<Client>();
    public static ArrayList<Banquier> banquier = new ArrayList<Banquier>();
    public static ArrayList<Historique> historique = new ArrayList<Historique>();
    public static ArrayList<OperationBancaire> operationBancaire = new ArrayList<OperationBancaire>();
    public static ArrayList<CompteAvecInteret> compteAvecInteret = new ArrayList<CompteAvecInteret>();
    public static ArrayList<CompteSansInteret> compteSansInteret = new ArrayList<CompteSansInteret>();
    public static ArrayList<Directeur> directeur = new ArrayList<Directeur>();
}
