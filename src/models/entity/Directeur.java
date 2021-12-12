package models.entity;

public class Directeur extends Employe {

    public boolean estDirecteur;

    public Directeur(String nom, String prenom, String cin, String adresse, String email, String numeroTelephone,
                     float salaire, String password, String username) {

        super(nom, prenom, cin, adresse, email, numeroTelephone, salaire, password, username);
        this.estDirecteur = true;
    }

    public String toString() {
        return "Directeur[" + super.toString() + "]";
    }
}
