package models.dal;

import models.entity.CompteCourant;

import java.util.ArrayList;

public class DAL_CompteCourant {

    public static CompteCourant getCompte(long compteID, long clientID , String password){
        return null;
    }

    public static ArrayList<CompteCourant> getAllCompte(){
        return null;
    }

    /***
     * L'équivalent de cette méthode dans la couche bll prendra en paramètre l'email qui fera office de password
     * @param clientID
     * @return
     */
    public static ArrayList<CompteCourant> getAllCompte(long clientID){
        return null;
    }

    public static void ajouterCompte(CompteCourant compte){

    }

    public static boolean supprimerCompte(long compteID){
        return false;
    }

    public static boolean updateCompte(long compteID,CompteCourant compte){
        return false;
    }
}
