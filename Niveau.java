package modele;

public class Niveau {

    private int id_Niveau;
    private String nom_Niveau;

    public Niveau(){
        this.id_Niveau = -1;
        this.nom_Niveau = "Pas de nom";
        System.out.println("Attention une Niveau a été cree par default");
    }

    public Niveau(int _id_Niveau, String _nom_Niveau){
        this.id_Niveau = _id_Niveau;
        this.nom_Niveau = _nom_Niveau;
    }


    @Override
    public String toString(){
        return "Nom du niveau : " + this.nom_Niveau + " Id du niveau : " + this.id_Niveau +"\n";
    }

}
