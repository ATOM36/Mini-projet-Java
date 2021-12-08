package models.dal;

import models.entity.CompteEpargne;

import java.util.ArrayList;

public class DAL_CompteEpargne {

    public static CompteEpargne getCompte(long compteID, long clientID , String password){
        return null;
    }

    public static ArrayList<CompteEpargne> getAllCompte(){
        return null;
    }

    /***
     * L'équivalent de cette méthode dans la couche bll prendra en paramètre l'email qui fera office de password
     * @param clientID
     * @return
     */
    public static ArrayList<CompteEpargne> getAllCompte(long clientID){
        return null;
    }

    public static void ajouterCompte(CompteEpargne compte){

    }

    public static boolean supprimerCompte(long compteID){
        return false;
    }

    public static boolean updateCompte(long compteID,CompteEpargne compte){
        return false;
    }
}
