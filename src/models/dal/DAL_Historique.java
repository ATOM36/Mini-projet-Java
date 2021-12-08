package models.dal;

import models.entity.Historique;

import java.util.ArrayList;

public class DAL_Historique {

    public static Historique getHistorique(long historiqueID, long clientID){
        return null;
    }

    /***
     * Retourne tous les historiques stockés
     * @return
     */
    public static ArrayList<Historique> getAllHistorique(){
        return null;
    }

    /***
     * Retourne tous les historiques d'un client précis
     * @param clientID
     * @return
     */
    public static ArrayList<Historique> getAllHistorique(long clientID){
        return null;
    }

    public static void ajouterHistorique(Historique record){

    }

    public static boolean supprimerHistorique(long historiqueID){
        return false;
    }

    public static boolean updateHistorique(long historiqueID,Historique record){
        return false;
    }
}
