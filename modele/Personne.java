package modele;


public class Personne {

    protected int id;
    protected String nom;
    protected String prenom;
    protected String sexe;


    public Personne(){
        this.id = -4;
        this.prenom = "Sans prenom";
        this.nom = "sans nom";
    }

    public Personne(int id_, String _nom, String _prenom, String sexe_){
        this.id = id_;
        this.prenom = _nom;
        this.nom = _prenom;
        this.sexe = sexe_;
    }
}
