package models.entity;

public class Banquier extends Employe {

    public boolean estBanquier;

    public Banquier(String nom, String prenom, String cin, String adresse, String email, String numeroTelephone,
                    float salaire, String password, String username) {

        super(nom, prenom, cin, adresse, email, numeroTelephone, salaire, password, username);
        estBanquier = true;
    }

    @Override
    public String toString() {
        return "Banquier [" + super.toString() + " ]";
    }
}
