package modele;

public class Eleve extends Personne {

    private Inscription AsTonInscrit;
    private int id_Classe;

    public Eleve(){
        this.AsTonInscrit= null;
    }


    public Eleve(int id_, String _nom, String _prenom, String sexe_){
        super(id_,_nom,_prenom,sexe_);
    }

    public Eleve(int id_, String _nom, String _prenom, String _Date_Inscription,int _Id_Inscription, int _id_classe, String Sexe_){
        this.id = id_;
        this.prenom = _nom;
        this.nom = _prenom;
        this.sexe = Sexe_;
        this.id_Classe = _id_classe;
        this.AsTonInscrit = new Inscription(_Date_Inscription,_Id_Inscription,_id_classe);
    }

    public void OnInscrit(String _Date_Inscription, int _Id_Inscription,int _Id_Classe){
        //this.AsTonInscrit = new Inscription(_Date_Inscription,_Id_Inscription,_Id_Classe);
    }

    @Override
    public String toString(){
        String result = " Nom : " + this.nom +  ", Prenom : " + this.prenom +", Sexe : " + this.sexe +  "  ";
        return result;
    }

    /*public String getsexe(){return this.sexe;}

    public String getnom(){return this.nom;}
    public String getprenom(){return this.prenom;}
    public int getid(){return this.id;}

*/
}
