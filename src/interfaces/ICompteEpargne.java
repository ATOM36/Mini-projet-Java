package interfaces;

import models.entity.CompteEpargne;

import java.util.ArrayList;

public abstract class ICompteEpargne {

    public static CompteEpargne getCompte(long compteID) {
        return null;
    }

    public static CompteEpargne getCompte(long compteID, long clientID) {
        return null;
    }

    public static ArrayList<CompteEpargne> getAllCompte(long clientID) {
        return null;
    }

    public static ArrayList<CompteEpargne> getAllCompte() {
        return null;
    }

    public static boolean supprimerCompte(long compteID) {
        return false;
    }

    static boolean supprimerCompte(CompteEpargne compte) {
        return false;
    }

    static boolean ajouterCompte(CompteEpargne compte) {
        return false;
    }

    static boolean updateCompte(long compteID, CompteEpargne compte) {
        return false;
    }
}
