package models.dal;

import models.entity.CompteCourant;
import models.entity.DataBase;

import java.util.ArrayList;

import interfaces.ICompteCourant;

public abstract class DAL_CompteCourant extends ICompteCourant {

    public static CompteCourant getCompte(long compteID) {
        CompteCourant result = null;
        int i = 0;

        while ((i < DataBase.compteCourant.size()) && (result == null)) {
            if (DataBase.compteCourant.get(i).compteID == compteID)
                result = DataBase.compteCourant.get(i);
            else
                i++;
        }

        return result;
    }

    public static CompteCourant getCompte(long compteID, long clientID) {
        CompteCourant result = null;
        int i = 0;

        while ((i < DataBase.compteCourant.size()) && (result == null)) {
            if (DataBase.compteCourant.get(i).compteID == compteID && DataBase.compteCourant.get(i).clientID == clientID)
                result = DataBase.compteCourant.get(i);
            else
                i++;
        }

        return result;

    }

    public static ArrayList<CompteCourant> getAllCompte() {
        return DataBase.compteCourant;
    }

    /***
     * L'équivalent de cette méthode dans la couche bll prendra en paramètre l'email qui fera office de password
     * @param clientID
     * @return
     */
    public static ArrayList<CompteCourant> getAllCompte(long clientID) {
        ArrayList<CompteCourant> result = new ArrayList<CompteCourant>();
        int i = 0;

        while ((i < DataBase.compteCourant.size())) {
            if (DataBase.compteCourant.get(i).clientID == clientID)
                result.add(DataBase.compteCourant.get(i));
            else
                i++;
        }

        return result;
    }

    public static boolean ajouterCompte(CompteCourant compte) {
        boolean result = false;
        try {
            DataBase.compteCourant.add(compte);
            result = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static boolean supprimerCompte(long compteID) {
        boolean result = false;
        int i = 0;

        while ((i < DataBase.compteCourant.size()) && (result == false)) {
            if (DataBase.compteCourant.get(i).compteID == compteID)
                try {
                    DataBase.compteCourant.remove(DataBase.compteCourant.get(i));
                    result = true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            else
                i++;
        }

        return result;
    }

    public static boolean updateCompte(long compteID, CompteCourant compte) {
        try {
            DataBase.compteCourant.set(DataBase.compteCourant.indexOf(getCompte(compteID)), compte);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
