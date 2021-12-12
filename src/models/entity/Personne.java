package models.entity;

public abstract class Personne {
    protected static long id = 1;
    public long myID;
    public String nom, prenom, cin, adresse, email, numeroTelephone;
    public float salaire;

    public Personne(String nom, String prenom, String cin, String adresse, String email, String numeroTelephone, float salaire) {
        myID = id++;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cin = cin;
        this.email = email;
        this.numeroTelephone = numeroTelephone;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "ID = " + myID + ", Nom = " + nom + ", Prenom = " + prenom + ", CIN = " + cin + ", Adresse = " + adresse +
                ", Email = " + email + "Numero Telephone = " + numeroTelephone + ", Salaire = " + salaire;
    }

}
