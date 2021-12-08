package models.entity;

public abstract class Employe extends Personne {
    protected String username, password;


    public Employe(String nom, String prenom, String cin, String adresse, String email, String numeroTelephone,
                   float salaire) {

        super(nom, prenom, cin, adresse, email, numeroTelephone, salaire);
        this.password = password;
        this.username = username;
    }
}
