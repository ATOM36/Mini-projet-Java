package models.dal;

import java.util.ArrayList;

import interfaces.IBanquier;
import models.entity.Banquier;
import models.entity.DataBase;

public abstract class DAL_Banquier extends IBanquier {

    public static Banquier getBanquier(long banquierID) {

        Banquier result = null;
        int i = 0;

        for (Banquier b : DataBase.banquier) {
            if (b.myID == banquierID) {
                result = b;
                break;
            }
        }
       /* while ((i < DataBase.banquier.size()) && (result == null)) {
            if (DataBase.banquier.get(i).myID == banquierID)
                result = DataBase.banquier.get(i);
            else
                i++;
        } */

        return result;

    }

    public static ArrayList<Banquier> getAllBanquier() {
        return DataBase.banquier;
    }

    public static boolean ajouterBanquier(Banquier lambda) {
        try {
            DataBase.banquier.add(lambda);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean supprimerBanquier(Banquier lambda) {
        try {
            DataBase.banquier.remove(lambda);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }


    public static boolean updateBanquier(long banquierID, Banquier lambda) {
        try {
            DataBase.banquier.set(DataBase.banquier.indexOf(getBanquier(banquierID)), lambda);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean supprimerBanquier(long banquierID) {

        return false;
    }
}