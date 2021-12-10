package models.dal;

import interfaces.IDirecteur;
import models.entity.DataBase;
import models.entity.Directeur;

import java.util.ArrayList;

public class DAL_Directeur implements IDirecteur {

    /***
     * Retourne le directeur actuel
     * @return
     */
    @Override
    public Directeur getDirecteur(){
        return DataBase.directeur.get(DataBase.directeur.size()-1);
    }

    /***
     * Retourne le directeur dont la reference est passée en paramètre
     * @param directeurID
     * @return
     */
    @Override
    public Directeur getDirecteur(long directeurID){
        Directeur result=null;
        int i=0;

        while((i<DataBase.directeur.size())&&(result==null)){
            if(DataBase.directeur.get(i).myID==directeurID)
                result=DataBase.directeur.get(i);
            else
                i++;
        }

        return  result;
    }

    @Override
    public ArrayList<Directeur> getAllDirecteur(){
        return DataBase.directeur;
    }

    @Override
    public boolean ajouterDirecteur(Directeur lambda){
        try{
            DataBase.directeur.add(lambda);
            return true;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean supprimerDirecteur(long directeurID){
        return false;
    }

    @Override
    public boolean updateDirecteur(long directeurID, Directeur lambda){
        return false;
    }

}
