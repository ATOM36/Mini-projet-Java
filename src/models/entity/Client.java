package models.entity;

public class Client extends Personne {
    public long banquierID;


    public Client(String nom, String prenom, String cin, String adresse, String email, String numeroTelephone,
                  float salaire, long banquierID) {

        super(nom, prenom, cin, adresse, email, numeroTelephone, salaire);
        this.banquierID = banquierID;
    }
}
