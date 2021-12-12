package controllers;

import interfaces.IBanquier;
import models.bll.BLL_Banquier;
import models.entity.Banquier;

import java.util.ArrayList;

public class BanquierController extends IBanquier {
    public static Banquier getBanquier(long banquierID) {
        return BLL_Banquier.getBanquier(banquierID);
    }

    public static ArrayList<Banquier> getAllBanquier() {
        return BLL_Banquier.getAllBanquier();
    }

    public static boolean ajouterBanquier(Banquier lamba) {
        return BLL_Banquier.ajouterBanquier(lamba);
    }

    public static boolean supprimerBanquier(Banquier lambda) {
        return BLL_Banquier.supprimerBanquier(lambda);
    }

    public static boolean supprimerBanquier(long banquierID) {
        return BLL_Banquier.supprimerBanquier(banquierID);
    }

    public static boolean updateBanquier(long banquierID, Banquier lambda) {
        return BLL_Banquier.updateBanquier(banquierID, lambda);
    }

}
