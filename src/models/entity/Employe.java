package models.entity;

public abstract class Employe extends Personne {
    protected String username, password;


    public Employe(String nom, String prenom, String cin, String adresse, String email, String numeroTelephone,
                   float salaire, String password, String username) {

        super(nom, prenom, cin, adresse, email, numeroTelephone, salaire);
        this.password = password;
        this.username = username;
    }

    public String toString() {
        return super.toString() + "Username = " + username + ", Mot de passe = " + password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
