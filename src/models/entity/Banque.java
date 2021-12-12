package models.entity;

public class Banque {
    public String nom, adresse;

    public Banque(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Banque [ Nom = " + nom + ", Adresse = " + adresse + " ]";
    }
}
