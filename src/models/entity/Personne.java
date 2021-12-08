package models.entity;

public abstract class Personne {
    protected static long id;
    protected long myID;
    protected String nom, prenom, cin, adresse, email, numeroTelephone;
    protected float salaire;

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
}
