package models.entity;

public class Banquier extends Employe {



    public Banquier(String nom, String prenom, String cin, String adresse, String email, String numeroTelephone,
                    float salaire) {

        super(nom, prenom, cin, adresse, email, numeroTelephone, salaire);
    }

    @Override
    public String toString(){
        return null;
    }
}
