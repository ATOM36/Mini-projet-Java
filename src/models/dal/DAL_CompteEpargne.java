package models.dal;

import interfaces.ICompteEpargne;
import models.entity.CompteEpargne;
import models.entity.DataBase;

import java.util.ArrayList;

public abstract class DAL_CompteEpargne extends ICompteEpargne {

    public static CompteEpargne getCompte(long compteID) {
        CompteEpargne result = null;
        int i = 0;

        while ((i < DataBase.compteEpargne.size()) && (result == null)) {
            if (DataBase.compteEpargne.get(i).compteID == compteID)
                result = DataBase.compteEpargne.get(i);
            else
                i++;
        }

        return result;
    }

    public static CompteEpargne getCompte(long compteID, long clientID) {
        CompteEpargne result = getCompte(compteID);
        if (result.clientID == clientID)
            return result;
        else
            return null;
    }

    /***
     * Retourne tous les comptes épargnes d'un client donné
     * @param clientID
     * @return
     */
    public static ArrayList<CompteEpargne> getAllCompte(long clientID) {
        ArrayList<CompteEpargne> result = new ArrayList<CompteEpargne>();

        for (CompteEpargne e : DataBase.compteEpargne) {
            if (e.clientID == clientID)
                result.add(e);
        }

        return result;
    }

    public static ArrayList<CompteEpargne> getAllCompte() {
        return DataBase.compteEpargne;
    }

    public static boolean supprimerCompte(long compteID) {
        try {
            DataBase.compteEpargne.remove(DataBase.compteEpargne.indexOf(getCompte(compteID)));
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean supprimerCompte(CompteEpargne compte) {
        try {
            DataBase.compteEpargne.remove(compte);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean ajouterCompte(CompteEpargne compte) {
        try {
            DataBase.compteEpargne.add(compte);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean updateCompte(long compteID, CompteEpargne compte) {
        try {
            DataBase.compteEpargne.set(DataBase.compteEpargne.indexOf(getCompte(compteID)), compte);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
