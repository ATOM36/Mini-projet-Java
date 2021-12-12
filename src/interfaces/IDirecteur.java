package interfaces;

import models.entity.Directeur;

import java.util.ArrayList;

public abstract class IDirecteur {
    public static Directeur getDirecteur() {
        return null;
    }

    public static Directeur getDirecteur(long directeurID) {
        return null;
    }

    public static ArrayList<Directeur> getAllDirecteur() {
        return null;
    }

    public static boolean ajouterDirecteur(Directeur lambda) {
        return false;
    }

    public static boolean supprimerDirecteur(long directeurID) {
        return false;
    }

    public static boolean supprimerDirecteur(Directeur lambda){
        return false;
    }

    public static boolean updateDirecteur(long directeurID, Directeur lambda) {
        return false;
    }
}
