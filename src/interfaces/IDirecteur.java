package interfaces;

import models.entity.Directeur;

import java.util.ArrayList;

public interface IDirecteur {
    Directeur getDirecteur();

    Directeur getDirecteur(long directeurID);

    ArrayList<Directeur> getAllDirecteur();

    boolean ajouterDirecteur(Directeur lambda);

    boolean supprimerDirecteur(long directeurID);

    boolean updateDirecteur(long directeurID, Directeur lambda);
}
