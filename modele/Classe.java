package modele;

import java.util.ArrayList;

public class Classe {

    private Niveau LeNiveau;
    private int id_Classe;
    private ArrayList<Enseignement> Tab_Cours;
    private ArrayList<Eleve> tab_Eleve;

    public Classe(){
        this.LeNiveau = new Niveau();
        this.id_Classe = -2;
        this.Tab_Cours = new ArrayList<>();
        this.tab_Eleve = new ArrayList<>();

    }

    public Classe(Niveau a, int _id_Classe){
        this.LeNiveau = a;
        this.id_Classe = _id_Classe;
        this.Tab_Cours = new ArrayList<>();
        this.tab_Eleve = new ArrayList<>();

    }
    public void addcoursauneClasse(Enseignement x){
        this.Tab_Cours.add(x);
    }
    public void addeleveauneclasse(Eleve e){
        this.tab_Eleve.add(e);
    }

    @Override
    public String toString(){
        String results = " Id de la classe : "+ this.id_Classe  + "\n Liste Eleve : \n";

        if(this.tab_Eleve.size()>0){

            for (Eleve temp : this.tab_Eleve) {
                results =  results + temp.toString() + " ";
            }
        } else {


            results = results + "Classe vide";
        }

        return results;
    }

}
