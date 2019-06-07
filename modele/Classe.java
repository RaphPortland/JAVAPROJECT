package modele;

import java.util.ArrayList;

public class Classe {

    private Niveau LeNiveau;
    private int id_Classe;
    private ArrayList<Enseignement> Tab_Cours;
    private ArrayList<Eleve> tab_Eleve;
    private AnneeScolaire annee;

    public Classe(){
        this.LeNiveau = new Niveau();
        this.id_Classe = -2;
        this.Tab_Cours = new ArrayList<>();
        this.tab_Eleve = new ArrayList<>();
        this.annee = new AnneeScolaire();

    }

    public Classe(Niveau a, int _id_Classe, AnneeScolaire ann){
        this.LeNiveau = a;
        this.id_Classe = _id_Classe;
        this.Tab_Cours = new ArrayList<>();
        this.tab_Eleve = new ArrayList<>();
        this.annee = ann;

    }

    @Override
    public String toString(){
        String results = "  Id de la classe : "+ this.id_Classe + "\nAnnee Scolaire : "+ this.annee.toString() + " Nombre de cours : " + this.Tab_Cours.size() +"\n  Liste Eleve : ";

        if(this.tab_Eleve.size()>0){
            results = results + " Taille Classe : "+this.tab_Eleve.size() + "\n     ";

            for (Eleve temp : this.tab_Eleve) {
                results =  results + temp.toString() + " ";
            }
        } else {
            results = results + " Classe vide\n     ";
        }
        results = results + "\n     ";
        if(this.Tab_Cours.size()>0){

            for (Enseignement temp : this.Tab_Cours) {
                results =  results + ""+temp.toString() + "\n     ";
            }
        } else {
            results = results + "Pas de cours";
        }

        return results;
    }

   /* public static Classe getDataClassefromSQLdatabase(){


        return this;
    }
*/

    public void addcoursauneClasse(Enseignement x){
        this.Tab_Cours.add(x);
    }
    public void addeleveauneclasse(Eleve e){
        this.tab_Eleve.add(e);
    }

    public int getId(){
        return this.id_Classe;
    }

}
