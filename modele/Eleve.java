package modele;

public class Eleve extends Personne {

    private Inscription AsTonInscrit;

    public Eleve(){
        this.AsTonInscrit= null;
    }
    public Eleve(String _Date_Inscription, int _Id_Inscription){
        //this.AsTonInscrit = new Inscription(_Date_Inscription,_Id_Inscription,-4);
    }

    public void OnInscrit(String _Date_Inscription, int _Id_Inscription,int _Id_Classe){
        //this.AsTonInscrit = new Inscription(_Date_Inscription,_Id_Inscription,_Id_Classe);
    }

}
