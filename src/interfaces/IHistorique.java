package interfaces;

import models.entity.Historique;

import java.util.ArrayList;

public abstract class IHistorique {

    public static Historique getHistorique(long historiqueID){
        return null;
    }

    public static Historique getHistorique(long historiqueID,long clientID){
        return null;
    }

    public static ArrayList<Historique> getAllHistorique(){
        return null;
    }

    public static ArrayList<Historique> getAllHistoriqueByBanquer(long banquierID){
        return null;
    }

    public static ArrayList<Historique> getAllHistorique(long clientID){
        return null;
    }

    public static boolean ajouterHistorique(Historique record){
        return false;
    }

    public static boolean supprimerHistorique(long historiqueID){
        return false;
    }

    public static boolean supprimerHistorique(Historique record) {
        return false;
    }

    public static boolean updateHistorique(long historiqueID, Historique record) {
        return false;
    }
}
