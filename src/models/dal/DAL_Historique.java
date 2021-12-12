package models.dal;

import interfaces.IHistorique;
import models.entity.DataBase;
import models.entity.Historique;

import java.util.ArrayList;

public abstract class DAL_Historique extends IHistorique {

    /***
     * Retourne l'historique dont l'ID est passé en paramètre s'il existe
     * @param historiqueID
     * @return
     */
    public static Historique getHistorique(long historiqueID) {
        Historique result = null;
        int i = 0;

        while ((i < DataBase.historique.size()) && (result == null)) {
            if (DataBase.historique.get(i).historiqueID == historiqueID)
                result = DataBase.historique.get(i);
            else
                i++;
        }

        return result;
    }

    /***
     * Retourne un historique précis d'un client donné
     * @param historiqueID
     * @param clientID
     * @return
     */
    public static Historique getHistorique(long historiqueID, long clientID) {
        Historique result = getHistorique(historiqueID);

        if (result.clientID == clientID)
            return result;
        else
            return null;
    }

    /***
     * Retourne tous les historiques stockés
     * @return
     */
    public static ArrayList<Historique> getAllHistorique() {
        return DataBase.historique;
    }

    /***
     * Retourne tous les historiques d'un client précis
     * @param clientID
     * @return
     */
    public static ArrayList<Historique> getAllHistorique(long clientID) {
        ArrayList<Historique> result = new ArrayList<Historique>();

        for (Historique h : DataBase.historique) {
            if (h.clientID == clientID)
                result.add(h);
        }

        return result;
    }

    /***
     * Retourne tous les historiques suivis par un banquier
     * @param banquierID
     * @return
     */
    public static ArrayList<Historique> getAllHistoriqueByBanquer(long banquierID) {
        ArrayList<Historique> result = new ArrayList<Historique>();

        for (Historique h : DataBase.historique) {
            if (h.banquierID == banquierID)
                result.add(h);
        }

        return result;
    }

    public static boolean ajouterHistorique(Historique record) {
        try {
            DataBase.historique.add(record);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean supprimerHistorique(long historiqueID) {
        try {
            DataBase.historique.remove(DataBase.historique.indexOf(getHistorique(historiqueID)));
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean updateHistorique(long historiqueID, Historique record) {
        try {
            DataBase.historique.set(DataBase.historique.indexOf(getHistorique(historiqueID)), record);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
