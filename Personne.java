package modele;


public class Personne {

    protected int id;
    protected String nom;
    protected String prenom;


    public Personne(){
        this.id = -4;
        this.prenom = "Sans prenom";
        this.nom = "sans nom";
    }

    public Personne(int id_, String _nom, String _prenom){
        this.id = id_;
        this.prenom = _nom;
        this.nom = _prenom;
    }
}