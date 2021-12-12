package models.bll;

import interfaces.IBanquier;
import models.dal.DAL_Banquier;
import models.entity.Banquier;

import java.util.ArrayList;

public abstract class BLL_Banquier extends IBanquier {
    public static Banquier getBanquier(long banquierID) {
        if (banquierID <= 0)
            return null;
        else
            return DAL_Banquier.getBanquier(banquierID);
    }

    public static ArrayList<Banquier> getAllBanquier() {
        if (DAL_Banquier.getAllBanquier().size() == 0)
            return null;
        else
            return DAL_Banquier.getAllBanquier();
    }

    public static boolean ajouterBanquier(Banquier lamba) {
        if ((lamba.prenom.length() < 3) || (lamba.nom.length() < 3) || (!(lamba.email.contains("@"))) ||
                (lamba.numeroTelephone.length() < 8) || (lamba.numeroTelephone.length() > 11))
            return false;
        else
            return DAL_Banquier.ajouterBanquier(lamba);
    }

    public static boolean supprimerBanquier(Banquier lambda) {
        if (lambda == null)
            return false;
        else
            return DAL_Banquier.supprimerBanquier(lambda);
    }

    public static boolean supprimerBanquier(long banquierID) {
        if (banquierID <= 0)
            return false;
        else
            return DAL_Banquier.supprimerBanquier(banquierID);

    }

    public static boolean updateBanquier(long banquierID, Banquier lambda) {
        if ((banquierID <= 0) || (lambda == null))
            return false;
        else
            return DAL_Banquier.updateBanquier(banquierID, lambda);
    }
}
