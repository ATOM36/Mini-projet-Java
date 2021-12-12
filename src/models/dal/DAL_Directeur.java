package models.dal;

import interfaces.IDirecteur;
import models.entity.DataBase;
import models.entity.Directeur;

import java.util.ArrayList;

public abstract class DAL_Directeur extends IDirecteur {

    /***
     * Retourne le directeur actuel
     * @return
     */
    public static Directeur getDirecteur() {
        return DataBase.directeur.get(DataBase.directeur.size() - 1);
    }

    /***
     * Retourne le directeur dont la reference est passée en paramètre
     * @param directeurID
     * @return
     */
    public static Directeur getDirecteur(long directeurID) {
        Directeur result = null;
        int i = 0;

        while ((i < DataBase.directeur.size()) && (result == null)) {
            if (DataBase.directeur.get(i).myID == directeurID)
                result = DataBase.directeur.get(i);
            else
                i++;
        }

        return result;
    }

    public static ArrayList<Directeur> getAllDirecteur() {
        return DataBase.directeur;
    }

    public static boolean ajouterDirecteur(Directeur lambda) {
        try {
            DataBase.directeur.add(lambda);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean supprimerDirecteur(long directeurID) {
        try {
            DataBase.directeur.remove(DataBase.directeur.indexOf(getDirecteur(directeurID)));
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean supprimerDirecteur(Directeur lambda) {
        try {
            DataBase.directeur.remove(DataBase.directeur.indexOf(lambda));
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean updateDirecteur(long directeurID, Directeur lambda) {
        try {
            DataBase.directeur.set(DataBase.directeur.indexOf(getDirecteur(directeurID)), lambda);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
