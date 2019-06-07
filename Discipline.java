package modele;

public class Discipline {
    private int id_Discipline;
    private String nom_Discipline;

    public Discipline(){
        this.id_Discipline = -1;
        this.nom_Discipline = "Pas de nom";
        //System.out.println("Attention une discipline a été cree par default");

    }
    public Discipline(int id_Discipline_, String nom_Discipline_){
        this.id_Discipline = id_Discipline_;
        this.nom_Discipline = nom_Discipline_;
    }

    @Override
    public String toString(){
        String res = "Discipline : " + this.nom_Discipline + " ID de la discipline : " + this.id_Discipline + "";
        return res;
    }
}
