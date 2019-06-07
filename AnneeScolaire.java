package modele;

public class AnneeScolaire {

    private int id_anneescolaire;
    private String nomdelannee;


    public AnneeScolaire(){
        this.id_anneescolaire = -1;
        this.nomdelannee = "0000";
    }

    public AnneeScolaire(int id_, String _nom_annee){
        this.id_anneescolaire = id_;
        this.nomdelannee = _nom_annee;
    }

    @Override
    public String toString(){
        return this.nomdelannee;
    }


}
